package com.teras.db.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
@Table(name = "assignComment")
public class AssignComment {
	@Id
	@Column(name = "commentNo", nullable = false)
    int commentNo;
	
	@Column(name = "content", nullable = false)
    String content;
	
	@Column(name = "submitDate", nullable = false)
    Date submitDate;
	
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    User userId;
    
    @ManyToOne
    @JoinColumn(name = "uuid", nullable = false)
    Attachment uuid;
    
    @ManyToOne
    @JoinColumn(name = "assignNo", nullable = false)
    Assignment assignNo;
}
