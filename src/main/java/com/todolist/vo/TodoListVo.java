package com.todolist.vo;

import com.todolist.dto.InsertTodoRespDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoListVo {
	private int todoListId;
	private String todoListContent;

	public InsertTodoRespDto toInsertDto(int successCount) {
		return InsertTodoRespDto.builder()
				.successCount(successCount)
				.todoListId(todoListId)
				.todoListContent(todoListContent)
				.build();
	}
}
