package com.student.studentCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.studentCRUD.entity.student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<student, Long> {

	List<student> findByNameContainingIgnoreCase(String keyword);

//	@Modifying
//	@Query("update Student s set s.result = :status where s.id = :id")
//	void updateResultStatus(long id, boolean status);

}
