package com.jsp;

public class TicketCancelException extends RuntimeException {
	private String msg;
	TicketCancelException(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
	

	
}
