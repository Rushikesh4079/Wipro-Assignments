package com.wipro.rushi.quizapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rushi.quizapp.entities.QuestionWrapper;
import com.rushi.quizapp.entities.Quiz;
import com.rushi.quizapp.entities.Response;

@Service
public class QuizService {

    public Quiz createQuiz(String category, String level, String title) {
        // TODO: implement logic to create quiz
        return null;
    }

    public List<QuestionWrapper> getQuizQuestions(Integer id) {
        // TODO: implement logic to get quiz questions
        return null;
    }

    public Integer calculateResult(int id, List<Response> responses) {
        // TODO: implement logic to calculate quiz result
        return null;
    }
}