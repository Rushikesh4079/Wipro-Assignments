package com.wipro.rushi.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.rushi.quizapp.entities.Quiz;

public interface Quizrepo extends JpaRepository<Quiz, Long> {

}
