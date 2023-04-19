package student;

public class Student {
	private String name;
	private int hashValue1;
	private int hashValue2;
	
	public Student(String name) {
		this.name = name;
		this.hashValue1 = hashCode(0);
		this.hashValue2 = hashCode(1);
	}

	public int getHashVal1() {
		return hashValue1;
	}
	public int getHashVal2() {
		return hashValue2;
	}

	public int hashCode(int n) {
		int value = (name.charAt(n) % 10);
		if (value == 0) {
			value = 1;
		}
		return 0;
	}
}
