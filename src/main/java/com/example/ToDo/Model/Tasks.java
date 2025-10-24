package com.example.ToDo.Model;

public class Tasks {
	
	private int id;
	private String title;
	private String description;
	private Status status;
	private Priority priority;
	public int getId() {
		return id;
	}
	
	
	public Tasks(int id, String title, String description, Status status, Priority priority) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.priority = priority;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	} 
	
	

}
