package com.todolist.service;

public class TodoListService {
	private static TodoListService instance;
	
	private TodoListService() {}
	
	public static TodoListService getInstance() {
		if(instance == null) {
			instance = new TodoListService();
		}
		
		
		return instance;
	}
}
