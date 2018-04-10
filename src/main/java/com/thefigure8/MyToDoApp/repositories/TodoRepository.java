package com.thefigure8.MyToDoApp.repositories;

import com.thefigure8.MyToDoApp.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo,String> {

}