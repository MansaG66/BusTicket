package com.jsp;

public interface Bus {
 void bookTicket(int seat);
 void cancelTicket(int seat);
 int getTicket();
 String displayErrorMessage();
}
