package exceptiondemos;
import java.util.*;
public class InvalidAgeException extends Exception 
{
public InvalidAgeException(String msg) {
super(msg);	
}
}

class NewYearParty
{
int eligibleAge = 16;
Scanner scanner = new Scanner(System.in);
int age;
public void enterClub() throws InvalidAgeException {
	System.out.println("Please enter your age!");
	age = scanner.nextInt();
	if(age<eligibleAge)
	{
		throw new InvalidAgeException("Under Age");
		
	}
	else {
		System.out.println("You can enter!");
	}
}
 public static void main(String[] args) throws InvalidAgeException {
	 NewYearParty party = new NewYearParty();
	 party.enterClub();
}
}





