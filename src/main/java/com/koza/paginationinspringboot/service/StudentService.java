package com.koza.paginationinspringboot.service;

import com.koza.paginationinspringboot.model.Student;
import com.koza.paginationinspringboot.model.requests.PageFilterRequest;
import com.koza.paginationinspringboot.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Page<Student> getAllStudents(PageFilterRequest request){
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        return studentRepository.findAll(pageable);

    }
}
