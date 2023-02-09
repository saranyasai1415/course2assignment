package p1;

public class TriangleChild extends Mathsproject{

	int b, h;

	TriangleChild(int b, int h) {
		this.b = b;
		this.h = h;
	}

	public void calculateArea() {
		double area = (b * h) / 2;
		System.out.println("Area of Triangle : " + area);
	}

}
