package com.nweligalla.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nayana = new Student(
                    "Nayana", LocalDate.of(1997, DECEMBER, 27), "nayana@gmail.com"
            );
            Student sadun = new Student(
                    "Sadun", LocalDate.of(2004, DECEMBER, 27), "sadun@gmail.com"
            );

            repository.saveAll(List.of(nayana, sadun));
        };
    }
}
