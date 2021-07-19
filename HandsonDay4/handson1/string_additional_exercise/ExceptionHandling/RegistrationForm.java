package exceptionhandling;

public class RegistrationForm {

	String name;
	String maritalStatus;
	int age;
	String sex;
	String DOB1;
	String emailId,phoneNo,interestedSubject,highEduQualification,nationality;
	
	public RegistrationForm ()
	{
			 name="NA";
			 maritalStatus="NA";
			 age=0;
			 sex="NA";
			 DOB1="NA";
			 emailId="xxx@gamil.com";
			 phoneNo="0000000000";
			 interestedSubject="NA";
			 highEduQualification="NA";
			 nationality="NA";
	}
	
	public RegistrationForm(String name, String maritalStatus, int age, String sex, String DOB1, String emailId,
			String phoneNo, String interestedSubject, String highEduQualification, String nationality) {
		super();
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.sex = sex;
		this.DOB1= DOB1;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.interestedSubject = interestedSubject;
		this.highEduQualification = highEduQualification;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public  int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDOB() {
		return DOB1;
	}

	public void setDOB(String DOB1) {
		this.DOB1 = DOB1;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getInterestedSubject() {
		return interestedSubject;
	}

	public void setInterestedSubject(String interestedSubject) {
		this.interestedSubject = interestedSubject;
	}

	public String getHighEduQualification() {
		return highEduQualification;
	}

	public void setHighEduQualification(String highEduQualification) {
		this.highEduQualification = highEduQualification;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "RegistrationForm [name=" + name + ", maritalStatus=" + maritalStatus + ", age=" + age + ", sex=" + sex
				+ ", DOB=" + DOB1 + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", interestedSubject="
				+ interestedSubject + ", highEduQualification=" + highEduQualification + ", nationality=" + nationality
				+ "]";
	}
	
	
	
	
	
}
