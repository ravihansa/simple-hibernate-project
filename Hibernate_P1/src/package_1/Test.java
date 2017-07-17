package package_1;

public class Test {

	public static void main(String[] args) {

		Student student1 = new Student();

		student1.setRegistrationNo(12345);
		student1.setFirstName("Darshana");
		student1.setAddress("Galle");

		StudentManager mg = new StudentManager();
		mg.saveStudent(student1);

	}
}
