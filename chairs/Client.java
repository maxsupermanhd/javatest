package chairs;

public class Client {
	public Chair chair;
	public void sit() {
		System.out.println("Sitting on a chair!");
	}
	public void setChair(Chair c) {
		this.chair = c;
	}
}
