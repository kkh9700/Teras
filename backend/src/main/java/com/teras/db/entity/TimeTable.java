package com.teras.db.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.teras.db.EmbeddedId.TimeTableId;

import lombok.Getter;

@Entity
@Getter
@Table(name = "timetable")
public class TimeTable {
	@EmbeddedId
	TimeTableId timeTableId;

	@ManyToOne
	@JoinColumn(name = "subjectCode", nullable = true)
	Subject subjectCode;
}
