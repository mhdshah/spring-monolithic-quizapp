package com.example.springmonolithicquizapp.dao;

import com.example.springmonolithicquizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
