package exceptiondemos;

public class CheckException {
	public void display1() throws Exception {
		System.out.println("Welcome in display");
		Thread.sleep(5000);
		System.out.println("Bye");
	}
public void display2() throws InterruptedException{
	System.out.println("Welcome in Display");
	Thread.sleep(1000);
	System.out.println("bye");

}

public static void main(String[] args) throws Exception{
	System.out.println("Main started");
	CheckException d = new CheckException();
	d.display1();
	d.display2();
	System.out.println("Main ended");;
}
}
