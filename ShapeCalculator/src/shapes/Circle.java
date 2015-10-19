package src.shapes;

public class Circle {

	double radius;

	
	
	
	public Circle(double r){
		this.radius = r;
	}


	public double getArea() {
		double Area;
		Area = (radius*(Math.pow((Math.PI), 2)));
		
		return Area;
	}


	public double getPerimeter() {
		double Perimeter;
		Perimeter = (radius*2*Math.PI);
		
		return Perimeter;
	}
	
	
	
}
