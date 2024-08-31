package com.example.taskSystemManagement.services;

import com.example.taskSystemManagement.dto.TaskDTO;
import com.example.taskSystemManagement.exceptions.TaskNotFoundException;
import com.example.taskSystemManagement.model.Task;
import com.example.taskSystemManagement.repository.ITaskRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskServices {

    @Autowired
    private ITaskRepository repository;

    public Task registerNewTask(TaskDTO data){
        var task =  new Task(data);
        return this.repository.save(task);
    }

    public Task updateTask(UUID idTask, TaskDTO updatedDataTask) throws TaskNotFoundException {
        var taskfounded = findTaskById(idTask);
        BeanUtils.copyProperties(updatedDataTask, taskfounded);
        return this.repository.save(taskfounded);
    }

    public void deleteTask(UUID idTask) throws TaskNotFoundException {
        var taskFounded = findTaskById(idTask);
        this.repository.delete(taskFounded);
    }

    public List<Task> getAll(){
       return this.repository.findAll();
    }

    public void updateTaskStatus(UUID idTask) throws TaskNotFoundException {
        var taskFounded = findTaskById(idTask);
        taskFounded.setFinished(true);
        this.repository.save(taskFounded);
    }

    private Task findTaskById(UUID idTask) throws TaskNotFoundException {
        return this.repository.findById(idTask).orElseThrow(() ->
                new TaskNotFoundException("Tarefa não encontrada para o id: " + idTask));
    }


}
