// sec 5 -->1.22  
package p1;

import java.util.*;

public class Mathsproject {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RectangleChild objectrect = new RectangleChild(4,3);
		SquareChild objsquare = new SquareChild(6);
		CircleChild objcircle = new CircleChild(7);
		TriangleChild objtri = new TriangleChild(3,2);
		
		ArrayList<Object> array = new ArrayList<Object>();
		array.add(objectrect);
		array.add(objsquare);
		array.add(objcircle);
		array.add(objtri);
		
		try {
		
		for(Object o : array) {
		
			if(o instanceof RectangleChild)
			{
				((RectangleChild) o).calculateArea();
			}
			if(o instanceof SquareChild)
			{
				((SquareChild) o).calculateArea();
			}
			if(o instanceof CircleChild)
			{
				((CircleChild) o).calculateArea();
			}
			if(o instanceof TriangleChild)
			{
				((TriangleChild) o).calculateArea();
			}
			
		}}catch(ArithmeticException e) {
			System.out.println("Exception caught "+e);
		}
	
	}

}
