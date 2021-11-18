package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student dev1ce = new Student(
                    "dev1ce",
                    "dev1ce@astralis.com",
                    LocalDate.of(1995, Month.JANUARY, 1)
            );

            Student m4tice = new Student(
                    "m4tice",
                    "m4tice@nip.com",
                    LocalDate.of(1995, Month.JANUARY, 1)
            );

            repository.saveAll(List.of(dev1ce, m4tice));
        };
    }
}
