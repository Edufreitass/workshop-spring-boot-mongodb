package com.nelioalves.workshop.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshop.mongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
