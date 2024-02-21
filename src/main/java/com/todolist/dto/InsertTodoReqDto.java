package com.todolist.dto;

import com.todolist.vo.TodoListVo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsertTodoReqDto {
	private String todoListContent;
	
	public TodoListVo toTodo() {
		return TodoListVo.builder()
				.todoListContent(todoListContent)
				.build();
	}
}
