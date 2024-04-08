package com.quiz.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.service.models.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
