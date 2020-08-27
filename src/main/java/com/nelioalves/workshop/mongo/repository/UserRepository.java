package com.nelioalves.workshop.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshop.mongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
