package chairs;

public class VictorianChair implements Chair {
	public int age;
	public VictorianChair(int age) {
		this.age = age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
