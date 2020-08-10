package tta.summerproject.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import tta.summerproject.models.ERole;
import tta.summerproject.models.Role;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
