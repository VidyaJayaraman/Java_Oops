package method.overloading;

public class StudentMethodOverLoading {

	public int getStudentInfo(int n) {
		
		return n;
		
	}
	
	public String getStudentInfo(String name)
	{
		
		return name;
		
	}
	
	public void getStudentInfo(String email, int id) {
		
		System.out.println("Email is " + email);
		System.out.println("Student Id is " + id);
		
	}
	public static void main(String[] args) {
		
		String name,emailId;
		int id, phoneNum;
		
		name = "Vidya";
		emailId="viddhu.j@gmail.com";
		id=54;
		phoneNum= 998877665;
		
		StudentMethodOverLoading access = new StudentMethodOverLoading();
		
		System.out.println("**************Method overloading****************");
		System.out.println("Name "+ access.getStudentInfo(name)); // returns name
		System.out.println("PhoneNum "+access.getStudentInfo(phoneNum)); // returns number
		access.getStudentInfo(emailId,id); // void method
		
	}

}
