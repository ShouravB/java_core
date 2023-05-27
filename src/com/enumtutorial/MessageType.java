package com.enumtutorial;

public enum MessageType {
	A(Priority.HIGH), B(Priority.LOW), C(Priority.MEDIUM), D(Priority.HIGH);
	
	private Priority priority;
	
	private  MessageType(Priority priority) {
		this.priority=priority;
	}
	
	public Priority getPriority() {
		return this.priority;
	}

}
