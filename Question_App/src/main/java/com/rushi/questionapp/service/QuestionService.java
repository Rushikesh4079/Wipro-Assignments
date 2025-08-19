package com.rushi.questionapp.service;

import com.rushi.questionapp.model.Question;

import java.util.List;

public interface QuestionService {
    Question saveQuestion(Question question);
    List<Question> getAllQuestions();
    Question getQuestionById(Long id);
    void deleteQuestion(Long id);
}