package homework4;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of the circle of objects is " + Circle1.numberOfObjects);
		
		Circle1 c1 = new Circle1();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" + 
				Circle1.numberOfObjects + ")");
		System.out.println();
		Circle1 c2 = new Circle1(5);
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modfying c1");
		System.out.println("c1: radius (" + c1.radius + 
				") and number of Circle objects (" + 
				Circle1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + 
				") and number of Circle objects (" + 
				Circle1.numberOfObjects + ")");
		
		
		
		
		
	
	}

}
