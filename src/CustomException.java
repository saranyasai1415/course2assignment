// sec 5 -- >1.18

class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}
}
public class CustomException {

	
	static void validate(int age )throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("ur age is lees than 18");
		}else {
			System.out.println("welcome to vote");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(24);
			validate(1);
			
		}catch(InvalidAgeException e) {
			System.out.println("caught custom exception"+e);
		}
		System.out.println("rest of the code");

	}

}
