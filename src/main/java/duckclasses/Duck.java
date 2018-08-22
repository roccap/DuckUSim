package duckclasses;
/**
 * 
 */

/**
 * @author paul
 *
 */
public abstract class Duck {
	FlyBehaviour flyBehaviour; 
	QuackBehaviour quackBehaviour;
	
	public abstract void  display();
	
	public Duck() {
		
	} 

	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void swim(){
		System.out.println("all ducks can float, even decoys");
	}
}
