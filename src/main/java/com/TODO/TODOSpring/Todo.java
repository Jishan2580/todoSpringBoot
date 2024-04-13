package com.TODO.TODOSpring;

import java.time.LocalDate;



public class Todo {
	public Todo(int id, String descreption,String username, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.descreption = descreption;
		this.targetDate = targetDate;
		this.done = done;
		this.username=username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", descreption=" + descreption + ", targetDate=" + targetDate + ", done=" + done
				+ ", username=" + username + "]";
	}

	private int id;
	private String descreption;
	private LocalDate targetDate;
	private boolean done;
	private String username;

}
