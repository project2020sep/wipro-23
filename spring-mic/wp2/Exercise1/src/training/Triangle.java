package training;

public class Triangle extends TwoDObject{
	
	
	
	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	public void area() {
		
		
		double area = 0.5 * (super.getDim1() * super.getDim2());
		System.out.println("area = "+ area);
	}
	
	

}
