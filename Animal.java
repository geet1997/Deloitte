package geet;
abstract class Animal {
	public abstract void makenoise();
	public abstract void eat();
	public  void sleep(){
		System.out.println("All animals sleep the same");
	}
	public abstract void roam();
}
abstract class Feline extends Animal {
	public void roam() {
		System.out.println("All felines roam the same");
	}
	
}
 class Lion extends Feline {
	public void makenoise() {
		System.out.println("All lions make same noise");
	}
	public void eat()
	{
		System.out.println("All lions eat the same way");
	}
}
 class Tiger extends Feline {
	public void makenoise() {
		System.out.println("All tiger make same noise");
	}
	public void eat()
	{
		System.out.println("All tiger eat the same way");
	}
}