package exceptionhandling;

import java.util.Scanner;

public class Student extends RegistrationForm{
	
	String admissionId;
	String result;
	

	RegistrationForm r=new RegistrationForm("Meena","single",20,"Female","July5","meenagovi57@gmail.com","9500735131","Maths","b.tech","Indian");
	
	public Student()
	{
		super("Meena","single",20,"Female","July5","meenagovi57@gmail.com","9500735131","Maths","b.tech","Indian");
		admissionId="NA";
		result="NA";
		//System.out.println(r.getAge());
	}
	public Student(String admissionId, String result) {
		
		this.admissionId = admissionId;
		this.result = result;
	//	System.out.println(r.getAge());
	}
	
	public void registerStudent()throws UniversityException
	{
		if(r.getAge()<23 || r.getAge()>35 )
			throw new UniversityException("*--student Unable to get admission here becuz ur details is not satified under our conditions--*");
		
	}
	
	public void registerForExam()
	{
		System.out.println("**You r Successfully registered for exam**");
	}
	
	public void appearForExam()
	{
		System.out.println("**appear for the exam and submit it after completing the examination**");
	}
	
	
}
