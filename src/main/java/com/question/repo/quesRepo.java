package com.question.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.entity.Question;

public interface quesRepo extends JpaRepository<Question, Integer> {

	//custom method -to find questions related to quiz id
	List<Question> findByQuizId(Integer quizId);
}
