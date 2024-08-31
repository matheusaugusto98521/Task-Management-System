package com.example.taskSystemManagement.model;

import com.example.taskSystemManagement.dto.TaskDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 200)
    private String description;

    private boolean isFinished;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public Task(TaskDTO data) {
        this.title = data.title();
        this.description = data.description();
    }
}
