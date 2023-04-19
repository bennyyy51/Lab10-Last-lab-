package student;

//By Megan Fleck
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
		int value = Character.toUpperCase(name.charAt(n));
		return value;
	}
	public boolean equals(Student s1) {
		String val1 = (s1.name).toUpperCase();
		String val2 = (this.name).toUpperCase();
		int length = val1.length();
		if(length == val2.length()) {
			for(int i = 0; i < length; i++) {
				if (val1.charAt(i) != val1.charAt(i)) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
}
