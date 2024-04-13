package com.TODO.TODOSpring;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {
	
	private static List<Todo> todos=new ArrayList<>();
   static {
		
		
		todos.add(new Todo(1,"Learn AWS","jishan shaikh",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1,"java","viresh",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1,"python","dainish",
				LocalDate.now().plusYears(1),false));
	}
   public List<Todo> findByUsername(String username){
	   
	   return todos;
   }
}
