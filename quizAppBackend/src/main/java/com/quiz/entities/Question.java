package com.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String text;
    String choice1;String choice2;String choice3;String choice4;
	int correctChoice;
	
	public Question() {	
		super();		
	}
	public Question(int id, String text, String choice1,String choice2,String choice3,String choice4,int correctChoice) {
		super();
		this.id = id;
		this.text = text;
		this.choice1=choice1;
		this.choice2=choice2;
		this.choice3=choice3;
		this.choice4=choice4;
        this.correctChoice = correctChoice;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {	
		this.text = text;		
	}	
	public int getCorrectChoice() {
		return correctChoice;
	}
	public void setCorrectChoice(int correctChoice) {
		this.correctChoice = correctChoice;
	}
	public String getChoice1() {
		return choice1;
	}
	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}
	public String getChoice2() {
		return choice2;
	}
	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}
	public String getChoice3() {
		return choice3;
	}
	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}
	public String getChoice4() {
		return choice4;
	}
	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}
	
}
