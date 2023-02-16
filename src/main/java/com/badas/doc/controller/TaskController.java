package com.badas.doc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.badas.doc.models.Task;
import com.badas.doc.service.impl.TaskService;

@Controller
@RequestMapping("/todo")
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public ResponseEntity<List<Task>> getAllTasks() {
		return ResponseEntity.ok(taskService.getAllTasks());
	}
	@GetMapping("/completed")
	public ResponseEntity<List<Task>> getCompletedTasks() {
		return ResponseEntity.ok(taskService.findByCompletedTask());
	}
	@GetMapping("/incompleted")
	public ResponseEntity<List<Task>> getIncompletedTasks() {
		return ResponseEntity.ok(taskService.findByIncompletedTask());
	}
	@PostMapping("/{id}")
	public ResponseEntity<Task> createTask(@RequestBody Task task){
		return ResponseEntity.ok(taskService.createNewTask(task));
	}
	@PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return ResponseEntity.ok(taskService.updateTask(task));
    }
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> getAllTasks(@PathVariable Task task) {
	    taskService.deleteTask(task);
	    return ResponseEntity.ok(true);
	    }
}
