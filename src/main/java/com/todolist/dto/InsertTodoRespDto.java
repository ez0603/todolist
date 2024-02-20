package com.todolist.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsertTodoRespDto {
	private int successCount;
	private int todoListId;
	private String todoListContent;
}
