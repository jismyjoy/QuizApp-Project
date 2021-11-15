package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.quiz.entities.Question;

@RestController
@CrossOrigin
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;

	@PostMapping("/")
	public Question addQuestion(@RequestBody Question question) {		
		return questionRepository.save(question);
	}
	
	@GetMapping("/")
	public List<Question> fetchAllQuizes(){
		return questionRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletequiz(@PathVariable("id") int id){
		ResponseEntity<Void> re = new ResponseEntity<Void>(HttpStatus.OK);
		try {
			questionRepository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			re= new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		return re;
	}

}
