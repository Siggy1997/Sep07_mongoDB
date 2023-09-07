package com.siggy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siggy.entity.Test;

public interface TestRepository extends MongoRepository<Test, Long> {


}
