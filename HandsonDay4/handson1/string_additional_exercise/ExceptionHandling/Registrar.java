package exceptionhandling;

public class Registrar {

	
	private Registrar()
	{
		
	}
	
	public static void getRegistrar()
	{
		System.out.println("I am the Registart");
	}
	
	public static void registerStudent(Student student) throws UniversityException
	{
		RegistrationForm r=new RegistrationForm();
		//System.out.println(r.getAge());
		if(r.getAge()>35)
			throw new UniversityException(" registrar U Unable to get admission here becuz ur details is not satified under our conditions");
		else if(r.getPhoneNo().length()<10)
			throw new ValidatorException("INVALID DETAILS-phone no");
	
	}
}
