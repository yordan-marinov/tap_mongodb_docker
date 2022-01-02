package com.yordanm.mongodb_docker.repository;

import com.yordanm.mongodb_docker.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
