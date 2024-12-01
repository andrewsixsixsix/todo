package com.andrewsixsixsix.todo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import org.testcontainers.utility.MountableFile;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:17.2"))
                .withCopyFileToContainer(
                        MountableFile.forHostPath(System.getProperty("user.dir").concat("/database/schema.sql")),
                        "/docker-entrypoint-initdb.d/"
                )
                .withDatabaseName("todo");
    }
}
