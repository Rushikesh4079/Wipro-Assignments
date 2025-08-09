package com.wipro.rushi.quizapp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.rushi.quizapp.entities.CategoryLevel;
import com.wipro.rushi.quizapp.entities.DifficultyLevel;
import com.wipro.rushi.quizapp.entities.Question;


public interface questionrepo extends JpaRepository<Question, Long> {

    List<Question> findByCategoryAndDifficulty(CategoryLevel categoryEnum, DifficultyLevel levelEnum);

}
