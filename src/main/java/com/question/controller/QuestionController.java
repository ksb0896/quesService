package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.entity.Question;
import com.question.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionService questionService;
	
	//constructor
	public QuestionController(QuestionService questionService) {
		super(); 
		this.questionService = questionService;
	}

	//create
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.add(question);
	}
	
	//get all
	@GetMapping("/getAll")
	public List<Question> getAll(){
		return questionService.getAll();
	}
	
	//by id
	@GetMapping("/getById/{qId}")
	public Question getById(@PathVariable("qId") Integer qId) {
		return questionService.getById(qId);
	}
	
	//get question by quiz id
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionOfQuiz(@PathVariable("quizId") Integer quizId){
		return questionService.getQuestionsByQuizId(quizId);
	}
	
}
