package com.thefigure8.MyToDoApp.repositories;

import com.thefigure8.MyToDoApp.models.Todo;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo,String> {

    List<Todo> findAll(Sort sortByCreatedAtDesc);
}