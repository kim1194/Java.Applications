class Student{
	int studentID = 101;
	String name = "John";
	int age = 15;
	String gender = "Male";
	
	public void study(){
		System.out.printf("Student_ID is %d%n", studentID);
		System.out.printf("Student_name is %s%n", name);
		System.out.printf("Student_age is %d%n", age);
		System.out.printf("Student_gender is %s%n", gender);
		System.out.println("I am Learning java");
	}
}

public class DemoStudent{
	public static void main(String[] args){
		Student student = new Student();
		student.study();
	}
}