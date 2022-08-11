package com.teras.db.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Builder
@Table(name = "assignment")
public class Assignment {
	@Id
	@Column(name = "assignNo", nullable = false)
    long assignNo;
	
	@Column(name = "title", nullable = false)
    String title;
	
	@Column(name = "content", nullable = false)
    String content;
	
	@Column(name = "deadline", nullable = false)
    String deadline;
	
	@CreatedDate
	@Column(name = "createDate", nullable = false)
    LocalDateTime createdDate;
	
    @ManyToOne
    @JoinColumn(name = "uuid", nullable = true)
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
