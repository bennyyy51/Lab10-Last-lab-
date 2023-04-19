import java.util.Arrays;

/*
 * A class for HashMaps with methods LF and resize.
 * @author Dylan Nguyen, updated by Megan
 */
public class HashMap {
	
	private int size = 0; //num of values used
	private int capacity = 0;
	private Student[] HashMap;
	
	public HashMap() {
		
	}
	
	/*
	 * Method to calculate the Loading Factor
	 * @author Dylan Nguyen
	 */
	private int LF() {		
		return size/capacity;
	}
	
	/*
	 * Method that resizes the Array.
	 * @author Dylan Nguyen
	 */
	public Object[] resize() {
		int newCapacity = 2 * HashMap.length;
		Student[] oldArray = HashMap;
		HashMap = new Student[newCapacity];
		
		for(int i = 0; i < oldArray.length; i++) {
			if(oldArray[i] != null) {
				add(oldArray[i]);
			}
		}		
		return HashMap;
	}
	
	//add method - Megan Fleck
	public boolean add(Student val) {
		int val1 = (val.getHashVal1()) % (HashMap.length);
		if (HashMap[val1] == null) {
			HashMap[val1] = val;
			size += 1;
			return true;
		}else if(HashMap[val1].equals(val)) {
			//object is already in the HashMap
			return false;
		}
		int val2 = (val.getHashVal2()) % (HashMap.length);
		if (val2 == 0) {
			val2 = 1;
		}
		int point = val1 + val2;
		
		//loops until repeat value, starting point, or open spot found
		while(point != val1) {
			if(point >= HashMap.length) {
				point -= HashMap.length;
			}
			if(HashMap[point].equals(val)) {
				//object is already in the HashMap
				return false;
			}else if (HashMap[point] == null) {
				HashMap[point] = val;
				size += 1;
				return true;
			}
			point += val2;
		}
		//no open spot found, resizing and trying again
		resize();
		add(val);
		return false;
	}
}
