package com.koza.paginationinspringboot;

import com.koza.paginationinspringboot.model.Student;
import com.koza.paginationinspringboot.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaginationInSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaginationInSpringBootApplication.class, args);
    }
    @Bean
    public CommandLineRunner loadData(StudentRepository StudentRepository){
        return args->{
            Student student=new Student();
            student.setFirstName("Sevda");
            student.setLastName("OLGUN");
            student.setGender('F');

            Student student1=new Student();
            student1.setFirstName("Mustafa Kemal");
            student1.setLastName("ATATÜRK");
            student1.setGender('M');

            Student student2=new Student();
            student2.setFirstName("Ayşe");
            student2.setLastName("KULİN");
            student2.setGender('F');

            Student student3=new Student();
            student3.setFirstName("Halide Edip");
            student3.setLastName("ADIVAR");
            student3.setGender('F');

            Student student4=new Student();
            student4.setFirstName("Orhan");
            student4.setLastName("Pamuk");
            student4.setGender('M');

            Student student5=new Student();
            student5.setFirstName("Stephen");
            student5.setLastName("Curry");
            student5.setGender('M');

            Student student6=new Student();
            student6.setFirstName("Mehmet Akif");
            student6.setLastName("ERSOY");
            student6.setGender('M');

            Student student7=new Student();
            student7.setFirstName("Marie");
            student7.setLastName("Curie");
            student7.setGender('F');


            StudentRepository.save(student);
            StudentRepository.save(student1);
            StudentRepository.save(student2);
            StudentRepository.save(student3);
            StudentRepository.save(student4);
            StudentRepository.save(student5);
            StudentRepository.save(student6);
            StudentRepository.save(student7);


        };
    }

}
