package javareview;

public class ClassExample {

	// These variables are only visible inside the class.  If we want these to
	//   change from outside the class we need to provide public methods.
	private String name;
	private int count;
	private int num;
	
	// Constructors.  This is called when we instantiate the class and is used
	//  for initialization.
	// We can have multiple constructors (overridden) as long as they have
	//  different signatures (type & number of parameters).  This allows us 
	//  to initialize objects in different ways.
	public ClassExample(String name, int num) {
		// The super() function is the constructor of the parent class
		super();
		
		// The this reference is a reference to the current object
		this.name = name;
		this.num = num;
		this.count = 0;  // We weren't given a count
	}
	public ClassExample(String name, int num, int count) {
		// The super() function is the constructor of the parent class
		super();
		
		// The this reference is a reference to the current object
		this.name = name;
		this.num = num;
		this.count = count;
	}

	// Whether or not to allow changes to objects to be made outside the class
	//  we need to provide accessor/mutator methods (also called getters &
	//  setters).  
	// For count we will allow the number to be changes by users of our class.
	//  However, we insist that the number must be positive.
	public int getNum() {
		return count;
	}

	public void setNum(int num) {
		if (num < 0) {
			this.num = 0;
		}
		else {
			this.num = num;
		}
	}

	// We usually will not want to allow user to just change the values
	//  of the data members.  But we can still allow a change of state 
	//  by providing a method that describes a behavior we want to 
	//  model.
	public void increment() {
		this.count ++;
	}
	
	// We typically want to provide a toString method which should return
	//  a string representation of the state of our object.  Not all 
	//  data members need to be included, it depends on what the 
	//  programmer thinks is best
	// Note that you should NOT have any println statements in your toString
	@Override
	public String toString() {
		return "ClassExample [name=" + name + ", count=" + count + ", num=" + num + "]";
	}

	// A main method in a Class is not necessary.  Normally we will be using
	//  our classes as a part of another class (or a driver class), but we can
	//  use a main method inside a class to test the class.
	public static void main(String[] args) {
		System.out.println("Test of ClassExample class");
		
		// Instantiate some objects
		ClassExample object1 = new ClassExample("Object1", 10);
		ClassExample object2 = new ClassExample("Object2", 20, 100);
		
		// Our toString method lets us print the objects easily
		System.out.println(object1);
		System.out.println(object2);
		
		System.out.println("\nChange object1");
		object1.setNum(45);
		object1.increment();
		System.out.println(object1);
		System.out.println(object2);

	}

}
