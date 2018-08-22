package duckclasses;

public class MallardDuck extends Duck{

	
	public MallardDuck() {
		this.flyBehaviour = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real mallard duck");
		
	}
	

}
