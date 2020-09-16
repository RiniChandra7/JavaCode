package shapes;

public class Driver {
	public static void main(String args[]) {
		Square sq = new Square(5, "Square");
		System.out.println("The area of a "+ sq.getName() +" with side = "+ sq.side +" is "+ sq.getArea());
		
		Circle cir = new Circle(4, "Circle");
		System.out.println("The area of a "+ cir.getName() +" with radius = "+ cir.radius +" is "+ cir.getArea());
		
		Cube cu = new Cube(5, "Cube");
		System.out.println("The volume of a "+ cu.getName() +" with side = "+ cu.side +" is "+ cu.getVolume());
		
		Cylinder cy = new Cylinder(3, 2, "Cylinder");
		System.out.println("The volume of a "+ cy.getName() +" with height = " + cy.height + " & radius = "+ cy.radius +" is " + cy.getArea());
		
		Sphere sp = new Sphere(3, "Sphere");
		System.out.println("The volume of a "+ sp.getName() +"with radius = "+ sp.radius +" is "+ sp.getVolume());;
	}
}
