package com.andrewsixsixsix.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "'user'")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String email;

    private String password;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String firstName;

    private String lastName;

    public User() {
    }

    public User(Long id, String username, String email, String password, LocalDateTime createdAt,
                LocalDateTime updatedAt, String firstName, String lastName) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;
        return getId().equals(user.getId()) &&
                getUsername().equals(user.getUsername()) &&
                getEmail().equals(user.getEmail()) &&
                getPassword().equals(user.getPassword()) &&
                getCreatedAt().equals(user.getCreatedAt()) &&
                getUpdatedAt().equals(user.getUpdatedAt()) &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getPassword().hashCode();
        result = 31 * result + getCreatedAt().hashCode();
        result = 31 * result + getUpdatedAt().hashCode();
        result = 31 * result + Objects.hashCode(getFirstName());
        result = 31 * result + Objects.hashCode(getLastName());
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
