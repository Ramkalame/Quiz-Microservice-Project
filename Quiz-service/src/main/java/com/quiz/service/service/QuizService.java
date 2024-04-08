package com.quiz.service.service;

import java.util.List;

import com.quiz.service.models.Quiz;

public interface QuizService {
	
	public Quiz add(Quiz quiz);
	
	public List<Quiz> get();
	
	public Quiz getSingle(Long quizId);
	
	public String deleteQuiz(Long quizId);

}
