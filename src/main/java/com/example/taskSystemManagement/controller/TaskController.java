package com.example.taskSystemManagement.controller;

import com.example.taskSystemManagement.dto.TaskDTO;
import com.example.taskSystemManagement.exceptions.TaskNotFoundException;
import com.example.taskSystemManagement.model.Task;
import com.example.taskSystemManagement.services.TaskServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/task")
@CrossOrigin("*")
public class TaskController {

    @Autowired
    private TaskServices services;

    @PostMapping("/register")
    public ResponseEntity<Task> registerNewTask(@RequestBody TaskDTO data){
        return ResponseEntity.status(HttpStatus.CREATED).body(this.services.registerNewTask(data));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateTask(@RequestParam("idTask")UUID idTask,
                                        @RequestBody TaskDTO updatedDataTask) throws TaskNotFoundException {
        return ResponseEntity.status(HttpStatus.OK).body(this.services.updateTask(idTask, updatedDataTask));
    }

    @PutMapping("/updateStatus")
    public ResponseEntity<?> updateTaskStatus(@RequestParam("idTask")UUID idTask) throws TaskNotFoundException {
        this.services.updateTaskStatus(idTask);
        return ResponseEntity.status(HttpStatus.OK).body("ALterado com sucesso");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteTask(@RequestParam("idTask")UUID idTask) throws TaskNotFoundException {
        this.services.deleteTask(idTask);
        return ResponseEntity.status(HttpStatus.OK).body("Tarefa excluída com sucesso");
    }

    @GetMapping("/")
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(this.services.getAll());
    }
}
