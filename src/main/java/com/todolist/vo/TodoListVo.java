package com.todolist.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoListVo {
	private int todoListId;
	private String todoListContent;
}
