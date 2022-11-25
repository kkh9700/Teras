package com.teras.db.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
@Table(name = "assignment")
public class Assignment {
	@Id
	@Column(name = "assignNo", nullable = false)
    int assignNo;
	
	@Column(name = "title", nullable = false)
    String title;
	
	@Column(name = "content", nullable = false)
    String content;
	
	@Column(name = "deadline", nullable = false)
    String deadline;
	
	@Column(name = "createDate", nullable = false)
    LocalDateTime createdDate = LocalDateTime.now();
	
    @ManyToOne
    @JoinColumn(name = "uuid", nullable = false)
    Attachment uuid;
    
    @ManyToOne
    @JoinColumn(name = "classCode", nullable = false)
    ClassEntity classCode;
    
    @ManyToOne
    @JoinColumn(name = "subjectCode", nullable = false)
    SubjectDetail subjectCode;
    
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    User userId;
}
