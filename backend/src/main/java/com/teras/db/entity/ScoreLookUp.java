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
class ScoreId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "userId", nullable = true)
    User userId;
	
    @ManyToOne
    @JoinColumn(name = "subjectCode", nullable = true)
    SubjectDetail subjectCode;

	@Column(name = "date", nullable = false)
    String date;
}

@Entity
@Getter
@Table(name = "scoreLookUp")
public class ScoreLookUp {
	@EmbeddedId
	ScoreId scoreId;
	
	@Column(name = "score", nullable = false)
    int score;
}
