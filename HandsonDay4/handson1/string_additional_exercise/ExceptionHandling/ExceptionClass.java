package exceptionhandling;

import java.util.Scanner;

public class ExceptionClass {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Student[] student=new Student[1];
				
		studentValidation(student);
		
	}

private static void studentValidation(Student[] student) {
	Registrar.getRegistrar();
	
	
	System.out.println("Enter the Ur details here!");
	System.out.println("name,  maritalStatus, age, sex, dOB, emailId, phoneNo, interestedSubject, highEduQualification, nationality");
	
	System.out.println("**Student**\n-- --My details are: -- --");
	student[0]=new Student();
	System.out.println(student[0]);
	try {
		Registrar.registerStudent(student[0]);
		student[0].registerStudent();
		student[0]=new Student("2017506557","pass");
		student[0].registerForExam();
		student[0].appearForExam();
	
	
	} 
	catch (UniversityException e) {
		System.out.println(e.getMessage());
	}


	
}
}
