package com.teras.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teras.api.request.NoticeRegisterPostReq;
import com.teras.api.response.NoticeListGetRes;
import com.teras.api.service.NoticeService;
import com.teras.api.service.UserService;
import com.teras.common.auth.SsafyUserDetails;
import com.teras.common.model.response.BaseResponseBody;
import com.teras.db.Dto.NoticeDto;
import com.teras.db.entity.ClassEntity;
import com.teras.db.entity.Notice;
import com.teras.db.entity.User;
import com.teras.db.repository.NoticeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "공지사항 API", tags = { "Notice" })
@AllArgsConstructor
@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	UserService userService;

	@Autowired
	NoticeService noticeService;

	@Autowired
	NoticeRepository noticeRepository;

	@ApiOperation(value = "공지사항 작성", notes = "사용자가 공지사항을 작성한다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "작성 성공"), @ApiResponse(code = 401, message = "인증 실패"),
			@ApiResponse(code = 500, message = "서버 오류") })
	@PostMapping()
	public ResponseEntity<? extends BaseResponseBody> register(
			@RequestBody @ApiParam(value = "공지사항 내용", required = true) NoticeRegisterPostReq registerInfo) {

		Notice notice = noticeService.createNotice(registerInfo);

		return ResponseEntity.status(200).body(BaseResponseBody.of(200, "SUCCESS"));
	}

	@ApiOperation(value = "공지사항 전체 조회", notes = "모든 공지사항을 조회한다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "조회 성공"), @ApiResponse(code = 500, message = "서버 오류") })

	@GetMapping()
	public ResponseEntity<? extends NoticeListGetRes> getList(@ApiIgnore Authentication authentication) {
		System.out.println("noticeList");
		SsafyUserDetails userDetails = (SsafyUserDetails) authentication.getDetails();
		String userId = userDetails.getUsername();
		User user = userService.getUserByUserId(userId);

		ClassEntity classEntity = user.getClassCode();

		List<NoticeDto> list = noticeService.getNoticeList(classEntity);

		return ResponseEntity.status(200).body(NoticeListGetRes.of(200, "SUCCESS", list));
	}

	@ApiOperation(value = "특정 게시글 조회", notes = "특정 공지사항을 조회한다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "조회 성공"),
		@ApiResponse(code = 404, message = "게시글 없음"),
		@ApiResponse(code = 500, message = "서버 오류")
		})
	@ApiImplicitParam(name = "noticeNo", value = "notice seq", required = true, dataType = "Long")
	@GetMapping("/{noticeNo}")
	public ResponseEntity getNotice(@PathVariable Long noticeNo) {

		return ResponseEntity.status(200).body(BaseResponseBody.of(200, "SUCCESS"));
	}

	@ApiOperation(value = "공지사항 수정", notes = "특정 공지사항을 수정한다.")
	@ApiResponses({
		@ApiResponse(code = 200, message = "수정 성공"),
		@ApiResponse(code = 401, message = "인증 실패"),
		@ApiResponse(code = 403, message = "권한 없음"),
		@ApiResponse(code = 404, message = "게시글 없음"),
		@ApiResponse(code = 500, message = "서버 오류")
	})
	@ApiImplicitParam(name = "noticeNo", value = "notice seq", required = true, dataType = "Long")
	@PutMapping("/{noticeNo}")
	public ResponseEntity editNotice(@ApiIgnore Authentication authentication,
			@RequestBody @ApiParam(value = "게시글 수정", required = true) NoticeRegisterPostReq noticePostReq,
			@PathVariable Long noticeNo) {

		return ResponseEntity.status(200).body(BaseResponseBody.of(200, "SUCCESS"));
	}

	@ApiOperation(value = "공지사항 삭제", notes = "공지사항을 삭제한다.")
	@ApiResponses({ @ApiResponse(code = 200, message = "삭제 성공"), @ApiResponse(code = 401, message = "인증 실패"),
			@ApiResponse(code = 403, message = "권한 없음"), @ApiResponse(code = 404, message = "게시글 없음"),
			@ApiResponse(code = 500, message = "서버 오류") })
	@ApiImplicitParam(name = "noticeNo", value = "notice seq", required = true, dataType = "Long")
	@DeleteMapping("/{noticeNo}")
	public ResponseEntity delete(@ApiIgnore Authentication authentication, @PathVariable Long noticeNo) {

		return ResponseEntity.status(200).body(BaseResponseBody.of(200, "SUCCESS"));
	}
}
