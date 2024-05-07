package com.mles.tutorial.repo;

import com.mles.tutorial.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentModelRepo extends JpaRepository<StudentModel, Long> {
}
