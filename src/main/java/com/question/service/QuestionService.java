package com.question.service;

import java.util.List;

import com.question.entity.Question;

public interface QuestionService {
	//create
	Question add(Question question);
	
	//all
	List<Question> getAll();
	
	//by id
	Question getById(Integer qId);
	
	//question by quiz id
	List<Question> getQuestionsByQuizId(Integer quizId);
}
