package com.TODO.TODOSpring;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	private TodoService todoService;
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	@GetMapping("list-todo")
	public String  ListAllTodos(Model mode) {
		List<Todo> byUsername = todoService.findByUsername("jishan shaikh");
		mode.addAttribute("todos", byUsername);
		return "ListTodos";
	}

}
