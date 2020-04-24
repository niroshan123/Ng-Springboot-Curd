package io.niroshan.curd.repositories;

import io.niroshan.curd.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long> {

//extends from java persistance api passing the parameters user object and the primary key
    Optional<User> findById(String id);
}
