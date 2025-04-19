package com.question.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.entity.Question;
import com.question.repo.quesRepo;
import com.question.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	//repo
	private quesRepo questionRepository;

	//constructor
	public QuestionServiceImpl(quesRepo questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	@Override
	public Question add(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question getById(Integer qId) {
		return questionRepository.findById(qId).orElseThrow(()-> new RuntimeException("Question not found!!"));
	}

	@Override
	public List<Question> getQuestionsByQuizId(Integer quizId) {
		return questionRepository.findByQuizId(quizId);
	}

}
