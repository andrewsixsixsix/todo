package com.andrewsixsixsix.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String title;

    private TaskStatus status;

    private TaskPriority priority;

    private String description;

    private LocalDate dueDate;

    @Column(insertable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Task() {
    }

    public Task(Long id,Long userId,String title,TaskStatus status,TaskPriority priority, String description,
                LocalDate dueDate, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.description = description;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Task task = (Task) o;
        return Objects.equals(getId(), task.getId()) &&
                getUserId().equals(task.getUserId()) &&
                getTitle().equals(task.getTitle()) &&
                getStatus() == task.getStatus() &&
                getPriority() == task.getPriority() &&
                Objects.equals(getDescription(), task.getDescription()) &&
                Objects.equals(getDueDate(), task.getDueDate()) &&
                Objects.equals(getCreatedAt(), task.getCreatedAt()) &&
                Objects.equals(getUpdatedAt(), task.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getId());
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + getPriority().hashCode();
        result = 31 * result + Objects.hashCode(getDescription());
        result = 31 * result + Objects.hashCode(getDueDate());
        result = 31 * result + Objects.hashCode(getCreatedAt());
        result = 31 * result + Objects.hashCode(getUpdatedAt());
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
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", createdAt=" + createdAt +
                ", updateAt=" + updatedAt +
                '}';
    }
}
