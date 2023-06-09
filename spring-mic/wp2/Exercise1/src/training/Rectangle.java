package training;

public class Rectangle extends TwoDObject{
	
	
	
	public Rectangle(int a, int b) {
		super(a,b);
		
	}

	public void area() {
		
		int area = super.getDim1() * super.getDim2();
		System.out.println("area = " + area);
		
	}
 
	public void perimeter() {
		
		int perimeter = 2 * (super.getDim1() +super.getDim2());
		System.out.println("perimeter = "+ perimeter);
	}

}
