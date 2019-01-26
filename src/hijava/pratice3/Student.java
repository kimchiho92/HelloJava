package hijava.pratice3;

public class Student {
	private String studentNumber;
	private String name;
	private String adress;
	private int age;
	private String phoneNumber;
	private String emailAdress;

	public Student() {

	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
		
 	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", adress=" + adress + ", age=" + age
				+ ", phoneNumber=" + phoneNumber + ", emailAdress=" + emailAdress + "]";
	}
}
