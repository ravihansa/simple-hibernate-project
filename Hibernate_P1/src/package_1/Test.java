package package_1;

public class Test {

	public static void main(String[] args) {

//		Student student1 = new Student();
//
//		student1.setRegistrationNo(12345);
//		student1.setFirstName("Darshana");
//		student1.setAddress("Galle");
//
//		StudentManager mg = new StudentManager();
//		mg.saveStudent(student1);

		StudentsMarks mark1 = new StudentsMarks();

		mark1.setRegistrationNo(12345);
		mark1.setMaths("34");
		mark1.setScience("78");
		mark1.setEnglish("67");

		StudentManager mg = new StudentManager();
		mg.saveStudentsMarks(mark1);

	}
}
