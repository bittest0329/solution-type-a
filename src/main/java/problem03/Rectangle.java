package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	double result=0.0;

	public Rectangle(double width, double height) {
		result = width * height;
		
	}

	@Override
	public void resize(double rate) {
		rate = this.result;
	}

	@Override
	public double getArea() {
		return 0.;
	}

	@Override
	public double getPerimeter() {
		return 0.;
	}
}