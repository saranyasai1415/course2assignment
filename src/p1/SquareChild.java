package p1;

public class SquareChild extends Mathsproject {

	float x;

	public SquareChild(float x) {
		this.x = x;

	}

	public void calculateArea() {

		float area = x * x;
		System.out.println("Area of Square : " + area);
	}
}
