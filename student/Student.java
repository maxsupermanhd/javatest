package student;

public class Student implements ExtComparable {
	int age;
	String group;
	public Student(int age, String group) {
		this.age = age;
		this.group = group;
	}
	public void PrintInfo() {
		System.out.println("Student: " + group + " " + age);
	}
	public int getAge() {
		return age;
	}
	@Override
	public int compareTo(Object b) {
		if(b instanceof Student) {
			Student a = (Student)b;
			return a.getAge() - this.age;
		} else {
			return 0;
		}
	}
}
