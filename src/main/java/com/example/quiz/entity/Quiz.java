package com.example.quiz.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Quiz {
	@Id
	private Integer id;	
	private String question;	
	private boolean answer;	
	private String author;
	
}
