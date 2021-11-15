package com.quiz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.quiz.controllers.QuestionController;
import com.quiz.controllers.QuestionRepository;
import com.quiz.controllers.SignupUsersController;
import com.quiz.controllers.SignupUsersRepository;
import com.quiz.entities.Question;
import com.quiz.entities.SignupUsers;

@RunWith(SpringRunner.class)
@SpringBootTest
class QuizAppBackendApplicationTests {
	
	@Autowired
	QuestionController questionController;
	@MockBean
	QuestionRepository questionRepository;
	
	@Autowired
	SignupUsersController signupUsersController;
	@MockBean
	SignupUsersRepository signupUsersRepository;
		
	@Test
	void contextLoads() {
		when(questionRepository.findAll()).thenReturn((List<Question>) Stream
				.of(new Question(0,"what is the colour of crow","red","black","blue","green",1),
						new Question(1,"what is the capital of india?","new delhi","mumbai","chennai","kochi",0)).collect(Collectors.toList()));
		assertEquals(2, questionController.fetchAllQuizes().size());
		}
	
	@Test
	void addQuestion() throws Exception{
		Question ent = new Question(2,"what is the capital of india?","new delhi","mumbai","chennai","kochi",0);
		when(questionRepository.save(ent)).thenReturn(ent);
		Question res = questionController.addQuestion(ent);
		assertEquals(ent, res);
	}
	
	@Test
	void contextLoadsTest() {
		when(signupUsersRepository.findAll()).thenReturn((List<SignupUsers>) Stream
				.of(new SignupUsers("rahul","rahul@test.com","test","1234567899"),
						new SignupUsers("ravi","ravi@test.com","test","9874563211")).collect(Collectors.toList()));
		assertEquals(2, signupUsersController.fetchAllUsers().size());
		}
	
	@Test
	void addUser() throws Exception{
		SignupUsers ent = new SignupUsers("ravi","ravi@test.com","test","9874563211");
		when(signupUsersRepository.save(ent)).thenReturn(ent);
		SignupUsers res = signupUsersController.addUser(ent);
		assertEquals(ent, res);
	}
	
	
//	@Test
//	public void deleteQuestionTest() {
//		Question ent = new Question(2,"what is the capital of india?","new delhi","mumbai","chennai","kochi",0);
//		questionController.deletequiz(2);
//		assertNull();
//	}

	

}
