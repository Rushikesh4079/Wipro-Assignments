package com.wipro.rushi.quizapp.service;

import java.util.List;

import com.wipro.rushi.quizapp.entities.Question;
public interface QuestionService {

	List<Question> getquestions();

	Question save(Question question);

	

	Question patchupdatequestions(Long id, Question question);

	void  deletequestion(Long id);

	

}
