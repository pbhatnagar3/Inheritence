/**
 * 
 * @author pbhatnagar
 *
 */
//This class inherits from class Animal
public class Dog extends Animal{
	/*
	 * 	there will have to be a constructor since we are inheriting from Animal which has a constructor that requires a arguement. 
	now in order to fill out the requirementa that a Dog is a specific case of a Animal, you will have to set the ID field 
	and thus we require a constructor
	 */
	String favoriteSport = "";
	
	//  all the methods' scope by default is package private :D and you know what that means
	public void setFavoriteSport(String sport){
		this.favoriteSport = sport;
	}
	/*
	 * In the case of the constructor, we will have to call the super constructor. this is required since we have to set that ID
	 * for the animal (we could get away with it if we had "hidden" the variable id)
	 * 
	 *
	 * CHANGE: I added a no argument requiring constructor to the Animal class and thus, we now dont have to call the super()
	 *  and potentially, as seen in the code below, I could do the following:
	 *  	set the inherited variable to a value. 
	 */
	public Dog(int id){
//		super(id);
		id = 10;
		System.out.println("one more Dog created with an argument");
	}
	
	public Dog(){
		System.out.println("one more Dog is being created without any arguments");
	}
	
	public void printID(){
		System.out.println(String.format("%d is the ID for the Dog. Take good care of it", id));
	}
	
}
