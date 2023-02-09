// sec 5 --> 1.17,1.21
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=0,num2 = 60;
		try {
			int a = num2/num1;
		}catch(ArithmeticException e) {
			System.out.println("cannot divide ny zero "+e);
		}catch(Exception e) {
			System.out.println("General exception");
		}finally {
			System.out.println("finally block");
		}
	}

}
