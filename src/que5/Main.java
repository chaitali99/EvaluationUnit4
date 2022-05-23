package que5;

public class Main {
	public static void main(String [] args) {
		Shapes shape=new Shapes();
		
		shape.area(new Circle());
		
		shape.area(new Rectangle());
		
		shape.area(new Square());
		
		System.out.println("This is static polymorphism here class called shapes has three method with single parameterbut different types. We are calling this three method with an object of shapes "
				+ ""+"class from main class main method by passing different arguments"+"That's why this is a static polymorphism"+
				"if we do this  by takinginput from the user in runtime then it will be called dynamic polymorphism");
	}
}
