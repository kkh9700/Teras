package com.teras.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
@Table(name = "subject")
public class Subject {

	@Id
	@Column(name = "subjectCode", unique = true, nullable = false)
	String subjectCode;

	@Column(name = "subjectName", nullable = false)
	String subjectName;
}
