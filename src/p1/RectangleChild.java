package p1;

public class RectangleChild extends Mathsproject {

	float x, y;

	public RectangleChild(float x, float y) {
		this.x = x;
		this.y = y;

	}

	public void calculateArea() {
		float area = x * y;
		System.out.println("Area of Rectangle : " + area);
	}
}
