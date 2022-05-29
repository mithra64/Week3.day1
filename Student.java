package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		
		System.out.println("Name of the student is - miku");
		
	}
	
	public void studentDept() {
		
		System.out.println("ECE Dept");
		
	}
	
	public void studentId() {
		
		System.out.println("16EC064");
		
	}
	
	public static void main(String[] args) {
		
		Student dept = new Student();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();
		dept.studentName();
		dept.studentDept();
		dept.studentId();
	}
	
}
