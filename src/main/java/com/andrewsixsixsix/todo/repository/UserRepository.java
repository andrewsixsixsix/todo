package com.andrewsixsixsix.todo.repository;

import com.andrewsixsixsix.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
