import student.Student;
import dog.Dog;
import balls.Ball;

public class Tester {
	public static void main(String[] args) {
		Ball b1 = new Ball(100, 100);
		System.out.println(b1);
		b1.move(30, 15);
		System.out.println(b1);
	}
}
