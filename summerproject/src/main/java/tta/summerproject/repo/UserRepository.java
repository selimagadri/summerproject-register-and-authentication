package tta.summerproject.repo;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import tta.summerproject.models.User;


public interface UserRepository extends MongoRepository<User, String> {
  Optional<User> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

}
