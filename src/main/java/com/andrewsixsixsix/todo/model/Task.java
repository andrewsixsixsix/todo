package com.andrewsixsixsix.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private String title;

    private TaskStatus status;

    private TaskPriority priority;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private String description;

    private LocalDate dueDate;

    public Task() {
    }

    public Task(Long id,Long userId,String title,TaskStatus status,TaskPriority priority, LocalDateTime createdAt,
                LocalDateTime updateAt, String description, LocalDate dueDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.description = description;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Task task = (Task) o;
        return getId().equals(task.getId()) &&
                getUserId().equals(task.getUserId()) &&
                getTitle().equals(task.getTitle()) &&
                getStatus() == task.getStatus() &&
                getPriority() == task.getPriority() &&
                getCreatedAt().equals(task.getCreatedAt()) &&
                getUpdateAt().equals(task.getUpdateAt()) &&
                Objects.equals(getDescription(), task.getDescription()) &&
                Objects.equals(getDueDate(), task.getDueDate());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + getPriority().hashCode();
        result = 31 * result + getCreatedAt().hashCode();
        result = 31 * result + getUpdateAt().hashCode();
        result = 31 * result + Objects.hashCode(getDescription());
        result = 31 * result + Objects.hashCode(getDueDate());
        return result;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
