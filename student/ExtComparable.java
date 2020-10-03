package student;

public interface ExtComparable<Student> extends Comparable {
	@Override
	public int compareTo(Object b);
}
