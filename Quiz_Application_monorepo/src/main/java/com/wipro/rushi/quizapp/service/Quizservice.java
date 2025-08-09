package com.wipro.rushi.quizapp.service;

import java.util.List;

import com.wipro.rushi.quizapp.entities.QuestionWrapper;
import com.wipro.rushi.quizapp.entities.Quiz;
import com.wipro.rushi.quizapp.entities.Response;

public interface Quizservice {

    Quiz createQuiz(String category, String level, String title);

    List<QuestionWrapper> getQuizquestions(Long id);

    Integer calculateResult(int id, List<Response> responses);
}
