package com.teras.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("NoticePostRequest")
public class NoticeRegisterPostReq {
	@ApiModelProperty(name = "제목", example = "제목입니다.")
	private String title;
	
	@ApiModelProperty(name = "내용", example = "내용입니다.")
	private String content;
	
	@ApiModelProperty(name = "반코드", example = "B0239838_03_05")
	private String classCode;
	
	@ApiModelProperty(name = "유저 ID", example = "ssafy")
	private String userId;
	
	@ApiModelProperty(name = "uuid", example = "09n8780w0wfw897wn")
	private String uuid;
	
	
}
