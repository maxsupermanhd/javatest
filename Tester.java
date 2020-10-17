import java.util.Scanner;
import dog.Dog;
import balls.Ball;
import guidemo.GuiDemo;
import student.*;
import shape.Shape;
import circle.Circle;
import rectangle.Rectangle;
import square.Square;
import movablecircle.MovableCircle;
import recursion.Recursion;
import cards.Cards;

public class Tester {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Avaliable tasks: 5");
		System.out.println(" = 0 Hello world (Kate)");
		System.out.println(" = 1 Dog");
		System.out.println(" = 2 Ball");
		System.out.println(" = 3 Shapes");
		System.out.println(" = 4 GUI");
		System.out.println(" = 5 Recursion (prime)");
		System.out.println(" = 6 Sort");
		System.out.println(" = 7 Card game");
		System.out.println("Enter a task number: ");
		int n = reader.nextInt();
		switch(n) {
			case 0:
			TestP0();
			break;
			case 1:
			TestP1();
			break;
			case 2:
			TestP2();
			break;
			case 3:
			TestP3();
			break;
			case 4:
			TestP4();
			break;
			case 5:
			System.out.println("Enter number to check: ");
			int j = reader.nextInt();
			TestP5(j);
			break;
			case 6:
			TestP6();
			break;
			case 7:
			TestP7();
			break;
			default:
			System.out.println("Wrong task number!");
			break;
		}
	}
	static private void TestP0() {
		student.Student kate = new student.Student(32, "Kate");
		kate.PrintInfo();
	}
	static private void TestP1() {
		Dog d1 = new Dog("Mike", 2);
		Dog d2 = new Dog("Helen", 7);
		Dog d3 = new Dog("Bob");
		d3.setAge(1);
		System.out.println(d1);
		d1.intoHumanAge();
		d2.intoHumanAge();
		d3.intoHumanAge();
	}
	static private void TestP2() {
		Ball b1 = new Ball(100, 100);
		System.out.println(b1);
		b1.move(30, 15);
		System.out.println(b1);
	}
	static private void TestP3() {
		MovableCircle a = new MovableCircle(1, 4, 0, 0, 2);
		System.out.println(a);
		Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
		System.out.println(s1);                    // which version?
		System.out.println(s1.getArea());          // which version?
		System.out.println(s1.getPerimeter());     // which version?
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// System.out.println(s1.getRadius());
		Circle c1 = (Circle)s1;   // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		// System.out.println(s3.getLength());
		Rectangle r1 = (Rectangle)s3;   // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		Shape s4 = new Square(6.6);     // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		// System.out.println(s4.getSide());  // Take note that we downcast Shape s4 to Rectangle, //  which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		// System.out.println(r2.getSide());
		System.out.println(r2.getLength());// Downcast Rectangle r2 to Square
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
	static private void TestP4() {
		new GuiDemo().setVisible(true);
	}
	static private void TestP5(int j) {
		System.out.println(Recursion.primecheck(j, 2)?"YES":"NO");
	}
	static private String NameGenerator() {
		int l = (int)(Math.random()*10)+3;
		String name = "";
		String j = "bcdfghjklmnpqrstvwxz";
		String k = "aeiouy";
		for(int c=0, i=0; i<l; i++) {
			if(Math.random() > 0.5 && c < 2) {
				name += j.charAt((int)(Math.random()*j.length()));
				c++;
			} else {
				name += k.charAt((int)(Math.random()*k.length()));
				c=0;
			}
		}
		return name;
	}
	public static void selectionSort(ExtComparable[] list) {
		int min;
		ExtComparable temp;
		for(int index = 0; index < list.length-1; index++) {
			min = index;
			for(int scan = index+1; scan < list.length; scan++) {
				if(list[scan].compareTo(list[min]) < 0) {
					min = scan;
				}
			}
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}
	static private void TestP6() {
		int num = 20;
		Student[] students = new Student[num];
		for(int i=0; i<num; i++) {
			students[i] = new Student((int)(Math.random()*num*num/2), NameGenerator());
		}
		for(int i=0; i<num; i++) {
			students[i].PrintInfo();
		}
		System.out.println("=======");
		selectionSort(students);
		for(int i=0; i<num; i++) {
			students[i].PrintInfo();
		}
	}
	static private void TestP7() {
		Cards g = new Cards();
		g.Input();
		g.Game();
	}
}
