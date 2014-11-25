package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	public static void main(String[] args) {

	}

	/**
	 * This code compiles fine but throws ClassCastException at runtime because
	 * we are trying to cast Object in the list to String whereas one of the
	 * element is of type Integer. 
	 */
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private static void withoutGenerics() {
		List rawList = new ArrayList();
		rawList.add("string");
		rawList.add(5);

		for (Object obj : rawList) {
			String str = (String) obj; // type casting leading to
										// ClassCastException at runtime
		}
	}

	@SuppressWarnings("unused")
	private static void withGenerics() {
		List<String> list = new ArrayList<String>(); // java 7 ? List<String>
														// list1 = new
														// ArrayList<>();

		list.add("abc");
		// list1.add(new Integer(5)); //compiler error

		for (String str : list) {
			// no type casting needed, avoids ClassCastException
		}
	}

}
