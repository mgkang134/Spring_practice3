package com.example.demo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo2.exam.Exam;
import com.example.demo2.exam.MathExam;

@ComponentScan("com.example.demo2")
@Configuration
public class Config {
	
	@Bean
	public Exam exam() {
		return new MathExam();
	}
	
	
}
