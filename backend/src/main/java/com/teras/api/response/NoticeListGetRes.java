package com.teras.api.response;

import java.util.List;

import com.teras.common.model.response.BaseResponseBody;
import com.teras.db.Dto.NoticeDto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("NoticeListGetRes")
public class NoticeListGetRes extends BaseResponseBody {
	@ApiModelProperty(name = "공지사항 목록", example = "list[{notice}, {notice}, ...]")
	List<NoticeDto> list;

	public static NoticeListGetRes of(Integer statusCode, String message, List<NoticeDto> list) {
		NoticeListGetRes res = new NoticeListGetRes();
		res.setStatusCode(statusCode);
		res.setMessage(message);
		res.setList(list);
		return res;
	}
}
