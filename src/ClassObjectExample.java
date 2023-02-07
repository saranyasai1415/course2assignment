// sec 5 --> 1.11

public class ClassObjectExample {
	
	String ename;
	int  eid;
	String designation;
	
	ClassObjectExample(String name,int id,String desig){
		
		ename = name;
		eid = id;
		designation = desig;
	}
	
	public void printDetails() {
		System.out.println("Employee name : "+ename +" emp id : "+eid+" designation : "+designation);
	}
	

}
