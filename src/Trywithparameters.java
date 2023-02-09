import java.io.*;

public class Trywithparameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fout = new FileOutputStream("abc.txt")){
			String msg = "Welcome to java";
			byte byteArray[] = msg.getBytes();
			fout.write(byteArray);
			System.out.println("message written successfully");
			
		}catch(Exception e){
			System.out.println("exception"+e);
		}
	}

}
