package src.shapes;

public class Trapez {

	double height;
	double top;
	double base;
	
	
	public Trapez(double b, double t, double h) {
		height = h;
		top = t;
		base = b;
	}
	
	
	
	public double getArea() {
		
		
		double Area = height*(base+top)/2;
		return Area;
	}

}
