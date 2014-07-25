/**
 * 
 * @author pbhatnagar
 *
 */
public class TestingInheritence {

	public static void main(String[] args){
		/*
		 * For the following, the Dog object will be created but first the constructor of Animal will be called and then the constructor of Dog
		 * will be called. Both of the constructors will not be taking any arguements
		 */
		Dog dojo = new Dog();
		System.out.println("**************");
		/*
		 * For the following, first, the constructor of the animal (w/o any arguments will be called) and then the constructor of the 
		 * Dog with arguments will be called. So clearly, there is no one to one mapping of the constructors from the parent or the super class
		 * to the constructor of the subclass
		 */
		Dog jacky = new Dog(12);
		System.out.println("**************");
		Animal bruno = new Dog();
		/*
		 * classic case of static binding. Since bruno, as on object is an instanceOf type Animal, the animal method is called and
		 * it is not over written with the printID() method of the Dog 
		 */
		bruno.printId();
		System.out.println("**************");
		/*
		 * The following attempt will not fly well with the Java compiler since it is looking for an object of type Dog (maybe it has to 
		 * accomplish some of the really specific task of being a Dog :) ) and we are providing it with an animal
		 * This is so not cool. Remember, a Dog is an animal. But an animal is not necessarily a dog.
		 * 
		 */
//		Dog yo = new Animal();
		
		Dog yo = new Dog();
		/*
		 * In the following, the printID() of the animal got overwritten :P
		 */
		yo.printID();
	}
	
}
