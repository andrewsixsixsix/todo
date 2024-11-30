package com.andrewsixsixsix.todo;

import com.andrewsixsixsix.todo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TodoApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    void givenUserRepository_whenFindAll_shallFindNone() {
        var users = repository.findAll();

        Assertions.assertEquals(0, users.size());
    }
}
