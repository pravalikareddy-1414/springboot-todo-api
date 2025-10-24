package com.example.ToDo.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ToDo.Model.Priority;
import com.example.ToDo.Model.Status;
import com.example.ToDo.Model.Tasks;


@Service
public class TasksService {
	
	private final List<Tasks> tasksList = Collections.synchronizedList(new ArrayList<>());
	private int nextId=1;
	
	public Tasks createTask(Tasks task)
	{
		 if (task.getId() == 0) 
			 {
			 task.setId(nextId++);                 // auto id
			 }
	        if (task.getStatus() == null)
	        {
	        	task.setStatus(Status.PENDING); // default status
	        }
	        if (task.getPriority() == null) 
	        	{
	        	task.setPriority(Priority.MEDIUM); // default priority
	        	}
		 tasksList.add(task);
		 return task;
		 
	}
	
	
	public List<Tasks> getAllTasks(){
		return tasksList;
	}
	
	
	public Tasks getTaskById(int id)
	{
		return tasksList.stream()
				.filter(t->t.getId()==id)
				.findFirst()
				.orElseThrow(()->new RuntimeException("TaskId not found"));
	}
	
	public Tasks updateTask(int id, Tasks updatedTask)
	{
		Tasks existing = this.getTaskById(id);
		
		if (existing != null) {
	        if (updatedTask.getTitle() != null) {
	            existing.setTitle(updatedTask.getTitle());
	        }
	        if (updatedTask.getDescription() != null) {
	            existing.setDescription(updatedTask.getDescription());
	        }
	        if (updatedTask.getStatus() != null) {
	            existing.setStatus(updatedTask.getStatus());
	        }
	        if (updatedTask.getPriority() != null) {
	            existing.setPriority(updatedTask.getPriority());
	        }
	    }
		
		return existing;
	}
	
	public List<Tasks> getTasksByStatus(Status status) {
        synchronized (tasksList) {
            return tasksList.stream()
                    .filter(t -> t.getStatus() == status)
                    .collect(java.util.stream.Collectors.toList());
        }
    }
	
	public List<Tasks> getTasksByPriority(Priority priority) {
        synchronized (tasksList) {
            return tasksList.stream()
                    .filter(t -> t.getPriority() == priority)
                    .collect(java.util.stream.Collectors.toList());
        }
    }
	
	public boolean deleteTask(int id)
	{
		Tasks existing = this.getTaskById(id);
		return tasksList.remove(existing);
	
	}
	
}

