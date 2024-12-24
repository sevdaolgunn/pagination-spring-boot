package com.koza.paginationinspringboot.repository;

import com.koza.paginationinspringboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
