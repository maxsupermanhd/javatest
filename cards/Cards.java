package cards;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Cards {
	public Stack<Integer> c1 = new Stack<Integer>();
	public Stack<Integer> c2 = new Stack<Integer>();
	public void Input() {
		Integer a[] = {0,1,2,3,4,5,6,7,8,9};
		List<Integer> al = Arrays.asList(a);
		al.toArray(a);
		Collections.shuffle(al);
		for(int i=0; i<5; i++) {
			c1.push(a[i]);
		}
		for(int i=4; i<9; i++) {
			c2.push(a[i]);
		}
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	public void Game() {
		for(int i=0; true; i++) {
			System.out.println("Step "+i);
			if(c1.isEmpty()) {
				System.out.println("first "+i);
				break;
			}
			if(c2.isEmpty()) {
				System.out.println("second "+i);
				break;
			}
			if(i == 106) {
				System.out.println("botva");
				break;
			}
			int a = c1.pop();
			int b = c2.pop();
			if(a<b) {
				c1.push(a);
				c1.push(b);
			} else {
				c2.push(a);
				c2.push(b);
			}
		}
	}
}
