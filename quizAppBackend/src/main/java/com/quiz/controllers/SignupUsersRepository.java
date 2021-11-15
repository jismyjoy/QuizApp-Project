package com.quiz.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Question;
import com.quiz.entities.SignupUsers;

public interface SignupUsersRepository extends JpaRepository<SignupUsers, Integer>{

}
