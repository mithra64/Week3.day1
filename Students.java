package org.student;

public class Students {

	public void getStudentInfo(int id) {
		
		System.out.println("Id of the student " + id);
		
	}
	
	public void getStudenntInfo(int id, String name) {
		
		System.out.println("Id of the student is " + id + "and name of the student is " + name);
		
	}
	
	public void getStudentInfo(String email, String phoneno) {
		
		System.out.println("mail and phone no of the student is " + email + " & " + phoneno);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students set = new Students();
		set.getStudentInfo(16);
		set.getStudenntInfo(16, "mikku");
		set.getStudentInfo("mikku21@gmail.com", "7010230896");
		
	}

}
