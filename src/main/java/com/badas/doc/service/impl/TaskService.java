package com.badas.doc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badas.doc.models.Task;
import com.badas.doc.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	public Task createNewTask(Task task) {
		return taskRepository.save(task);
	}
	
	public List<Task> getAllTasks(){
		return taskRepository.findAll();
	}
	
	public Task findTaskById(Long id) {
		return taskRepository.getById(id);
	}
	
	public List<Task> findByCompletedTask(){
		return taskRepository.findByCompletedTrue();
	}
	
	public List<Task> findByIncompletedTask(){
		return taskRepository.findByCompletedfalse();
	}
	
	public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
	
	public Task updateTask(Task task) {
		return taskRepository.save(task);
	}
	
}
