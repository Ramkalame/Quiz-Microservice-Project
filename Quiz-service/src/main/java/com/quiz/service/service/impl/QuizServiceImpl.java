package com.quiz.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.service.models.Quiz;
import com.quiz.service.repositories.QuizRepository;
import com.quiz.service.service.QuizService;


@Service
public class QuizServiceImpl implements QuizService{
	
	
	
	@Autowired
	private QuizRepository quizRepo;

	@Override
	public Quiz add(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quiz getSingle(Long quizId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return null;
	}

}
