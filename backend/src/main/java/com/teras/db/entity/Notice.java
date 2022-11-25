package com.teras.db.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Builder
@Table(name = "notice")
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "noticeNo", nullable = false)
	long noticeNo;

	@Column(name = "title", nullable = false)
	String title;

	@Column(name = "content", nullable = false)
	String content;

	@CreatedDate
	@Column(name = "createDate", nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	Timestamp createdDate;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	User user;

	@ManyToOne
	@JoinColumn(name = "classCode", nullable = false)
	ClassEntity classCode;

	@ManyToOne
	@JoinColumn(name = "attach", nullable = true)
	Attachment attach;

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", title=" + title + ", content=" + content + ", createdDate="
				+ createdDate + ", user=" + user + ", classCode=" + classCode + ", attach=" + attach + "]";
	}
}
