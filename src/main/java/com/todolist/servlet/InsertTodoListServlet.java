package com.todolist.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todolist.dto.InsertTodoReqDto;
import com.todolist.service.TodoListService;
import com.todolist.utils.RequestUtil;
import com.todolist.utils.ResponseEntitiy;

@WebServlet("/insert")
public class InsertTodoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TodoListService todoListService;

    public InsertTodoListServlet() {
        super();
        todoListService = TodoListService.getInstance();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InsertTodoReqDto insertTodoReqDto = RequestUtil.convertJsonData(request, InsertTodoReqDto.class);
		
		ResponseEntitiy.ofJson(response, 201, todoListService.addTodo(insertTodoReqDto));
		System.out.println("요청 들어옴");
	}

}
