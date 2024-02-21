package com.todolist.service;

import com.todolist.dto.InsertTodoReqDto;
import com.todolist.dto.InsertTodoRespDto;
import com.todolist.vo.TodoListVo;

import dao.TodoListDao;


public class TodoListService {
	private static TodoListService instance;
	private TodoListDao todoListDao;
	
	private TodoListService() {
		todoListDao = TodoListDao.getInstance();
	}
	
	public static TodoListService getInstance() {
		if(instance == null) {
			instance = new TodoListService();
		}
		
		
		return instance;
	}
	public InsertTodoRespDto addTodo(InsertTodoReqDto insertTodoReqDto) {
		TodoListVo todoListVo = insertTodoReqDto.toTodo();
		
		int successCount = todoListDao.saveTodo(todoListVo);
		
		return todoListVo.toInsertDto(successCount);

	}
}
