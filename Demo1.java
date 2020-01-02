package exceptiondemos;
import java.util.*;

public class Demo1 {
int num1, num2;
int result;
Scanner scanner = new Scanner(System.in);
public void display() {
	System.out.println("Welcome in Display");
try {
	System.out.println("Enter first number");
num1 = scanner.nextInt();
System.out.println("Enter second number");
num2 = scanner.nextInt();
result = num1/num2;
System.out.println(result);
}
catch(InputMismatchException e)
{
	System.out.println("Please enter a number");

}
catch (ArithmeticException e)

{
System.out.println("0 can't be entered!");
}

}
 public static void main(String[] args) {
	System.out.println("Main Started");
	
	Demo1 d = new Demo1();
	d.display();
	System.out.println("Main ends");
	
}


}
