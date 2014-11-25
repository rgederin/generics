package generics;

public class GenericType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	/**
	 * Notice the use of GenericsType class in the main method. We don’t need to
	 * do type-casting and we can remove ClassCastException at runtime. If we
	 * don’t provide the type at the time of creation, compiler will produce a
	 * warning that “GenericsType is a raw type. References to generic type
	 * GenericsType<T> should be parameterized”. When we don’t provide type, the
	 * type becomes Object and hence it’s allowing both String and Integer
	 * objects but we should always try to avoid this because we will have to
	 * use type casting while working on raw type that can produce runtime
	 * errors.
	 * 
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		GenericType<String> type = new GenericType<>();
		type.set("Pankaj"); // valid

		GenericType type1 = new GenericType(); // raw type
		type1.set("Pankaj"); // valid
		type1.set(10); // valid and autoboxing support
	}
}
