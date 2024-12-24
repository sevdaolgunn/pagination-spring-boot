package com.koza.paginationinspringboot.controller;

import com.koza.paginationinspringboot.model.Student;
import com.koza.paginationinspringboot.model.requests.PageFilterRequest;
import com.koza.paginationinspringboot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public Page<Student> getItems(PageFilterRequest request){
        return studentService.getAllStudents(request);
    }

    @GetMapping("/students/prms")
    public Page<Student> getItems(@RequestParam(name = "page", defaultValue = "0") int page,
                                  @RequestParam(name = "size", defaultValue = "3") int size){
        return studentService
                .getAllStudents(PageFilterRequest.builder()
                        .page(page)
                        .size(size)
                        .build());
    }
}
