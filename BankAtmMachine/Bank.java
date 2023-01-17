package jspider;
public interface Bank
{
   void deposit( int amount);
   void withdraw(int amount);
   int getBalance();
   String displayErrorMessage();
}
