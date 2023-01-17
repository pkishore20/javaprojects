package jspiders;
public interface BusBooking 
{
	void bookTicket(int tickets);
	void cancelTicket(int tickets);
	int  viewTickets();
	String displayErrorMessage();
}
