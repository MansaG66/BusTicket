package com.jsp;

public class BusTicketImp implements Bus {
private int numberfseats;
BusTicketImp(int numberfseats){
	this.numberfseats=numberfseats;
}

@Override
public void bookTicket(int seat) {
	// TODO Auto-generated method stub
	System.out.println("Please number of seats to be booked");
	numberfseats+=seat;
	System.out.println("The number of seats booked are:"+seat);
}

@Override
public void cancelTicket(int seat) {
	if(numberfseats<=seat) {
		System.out.println("Numbers of seats to be cancelled "+seat);
		numberfseats=-seat;
		System.out.println("The tickets have cancelled  sucessfully");
		}
	else {
		try {
			throw new TicketCancelException("No more tickets");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
@Override
public int getTicket() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public String displayErrorMessage() {
	// TODO Auto-generated method stub
	return "Enter valid message";
}

}
