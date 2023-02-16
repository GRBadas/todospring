package com.badas.doc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String task;
	private boolean completed;
	
	public Task(String task, boolean completed) {
		super();
		this.task = task;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

	public boolean isCompleted() {
		return completed;
	}

	 public void setId(Long id) {
	        this.id = id;
	    }

	public void setTask(String task) {
		this.task = task;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	

}
