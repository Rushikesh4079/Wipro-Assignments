package com.wipro.rushi.quizapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.rushi.quizapp.entities.Question;
import com.wipro.rushi.quizapp.enums.Category;
import com.wipro.rushi.quizapp.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/question")
@RequiredArgsConstructor
public class QuestionController {

	
	private final QuestionService questionService;


	
    @GetMapping("/category/{category}")
    public List<com.rushi.quizapp.entities.Question> getQuestionsByCategory(@PathVariable Category category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public com.rushi.quizapp.entities.Question addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }
	
	
}