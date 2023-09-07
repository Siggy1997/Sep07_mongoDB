package com.siggy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siggy.entity.Board;

public interface BoardRepository extends MongoRepository<Board, Object> {

}
