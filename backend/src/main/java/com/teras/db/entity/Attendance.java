package com.teras.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Embeddable
class AttendanceId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    User userId;
	
	@Column(name = "date", nullable = false)
    String date;
}

@Entity
@Getter
@Table(name = "attendance")
public class Attendance {
	@EmbeddedId
	AttendanceId attendanceId;
	
	@Column(name = "statement", nullable = false)
    int statement;
}