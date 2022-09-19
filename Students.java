package org.students;

import org.department.Department;


// Subclass extends parent class 

public class Students extends Department {

	
	public void studentName()
	
	{
		System.out.println("Student Name is Vidya");
		
	}
	
public void studentID()
	
	{
		System.out.println("Student Id is 54");
		
	}
	
public void studentDept()

{
	System.out.println("Student Dept is ECE");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department access = new Department();
		
		access.collegeName();
		access.collegeCode();
		access.collegeRank();
		access.departmentName();
		
		
	}

}
