package com.wipro.rushi.quizapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rushi.quizapp.entities.Question;

public interface QuestionService {

    List<Question> getQuestionsByCategory(com.wipro.rushi.quizapp.enums.Category category);

    List<Question> getAllQuestions(); // Renamed from getAllQuestions1

    Question getQuestionById(Long id);

    void deleteQuestionById(Long id);

    Question patchUpdateQuestionById(Long id, Question question);

    Page<Question> findAllUserPage(Pageable pageable);

    Question addQuestion1(com.wipro.rushi.quizapp.entities.Question question); // keep this for adding new questions

	Question addQuestion(com.wipro.rushi.quizapp.entities.Question question);
}
