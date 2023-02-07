// sec 5--> 1.3
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("implicit type conversion :");
		char c = 'c';
		System.out.println(" value of char "+c);
		
		int b =c;
		System.out.println("value of int "+b);
		
		float f = c;
		System.out.println("value of float "+f);
		
		double d = c;
		System.out.println("value of double "+d);
		
		System.out.println("Explicit type conversion ");
		
		double num = 345.67;
		
		int a = (int)num;
		System.out.println("a = "+a);
		
		float ff = (float)num;
		System.out.println("ff :"+ff);
		

	}

}
