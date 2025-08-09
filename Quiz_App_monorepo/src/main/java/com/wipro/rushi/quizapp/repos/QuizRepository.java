package com.wipro.rushi.quizapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rushi.quizapp.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}