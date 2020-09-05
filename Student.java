package student;

public class Student {
	int age;
	String group;
	public Student(int age, String group) {
		this.age = age;
		this.group = group;
	}
	public void PrintInfo() {
		System.out.println("Student: " + group + " " + age);
	}
}
