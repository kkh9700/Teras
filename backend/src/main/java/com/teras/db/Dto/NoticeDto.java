package com.teras.db.Dto;

import com.teras.db.entity.Notice;

import lombok.Data;

@Data
public class NoticeDto {
	private Long noticeNo;
	private String title;
	private String content;
	private String userId;
	private String createdDate;
	private String uuid;

	public NoticeDto(Notice notice) {
		this.noticeNo = notice.getNoticeNo();
		this.title = notice.getTitle();
		this.content = notice.getContent();
		this.userId = notice.getUser().getUserId();
		this.createdDate = notice.getCreatedDate().toString();
		if (notice.getAttach() != null)
			this.uuid = notice.getAttach().getUuid();
	}

}
