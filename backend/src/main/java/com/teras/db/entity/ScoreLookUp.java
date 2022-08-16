package com.teras.db.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.teras.db.embeddedId.ScoreId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Builder
@Table(name = "scoreLookUp")
public class ScoreLookUp {
	@EmbeddedId
	ScoreId scoreId;
	
	@Column(name = "score", nullable = false)
    int score;
}
