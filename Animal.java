/**
 * 
 * @author pbhatnagar
 *
 */
//the whole idea is to test the inheritence and learn more about it

public class Animal {

	int id;
	
	public Animal(int id){
		System.out.println("one animal created with an argument. Great job");
		this.id = id;
	}
	
	public Animal(){
		System.out.println("Animal constructor without an arguement");
		
	}
	 
	public void printId(){
		System.out.println(String.format("%d is the id of the animal. Take care of it", this.id));
	}
}
