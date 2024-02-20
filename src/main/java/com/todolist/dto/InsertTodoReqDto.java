package com.todolist.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsertTodoReqDto {
	private String todoListContent;
}
