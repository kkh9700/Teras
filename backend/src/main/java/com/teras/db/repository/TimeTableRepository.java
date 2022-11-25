package com.teras.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teras.db.EmbeddedId.TimeTableId;
import com.teras.db.entity.ClassEntity;
import com.teras.db.entity.TimeTable;
import com.teras.db.response.TimeTableInterface;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, TimeTableId> {
	@Query(value = "select day, period, subject_code from timetable where class_code = :classCode", nativeQuery = true)
	List<TimeTableInterface> findByClassCode(@Param("classCode")ClassEntity classCode);
}
