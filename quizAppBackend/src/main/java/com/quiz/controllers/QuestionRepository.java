package com.quiz.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
