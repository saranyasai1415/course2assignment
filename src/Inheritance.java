//sec 5 -->1.13

class A{
	
	public void methodA() {
		System.out.println("in method A");
	}
}

class B extends A{
	
	public void methodB() {
		System.out.println("in method B");
	}
}
public class Inheritance extends B {
	
	public void methodC() {
		System.out.println("in method C");
	}
	
	public static void main(String args[]) {
		
		Inheritance obj = new Inheritance();
		obj.methodA();
		obj.methodB();
		obj.methodC();
		
	}

}
