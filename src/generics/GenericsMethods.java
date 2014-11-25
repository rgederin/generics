package generics;

/**
 * Notice the isEqual method signature showing syntax to use generics type in
 * methods. Also notice how to use these methods in our java program. We can
 * specify type while calling these methods or we can invoke them like a normal
 * method. Java compiler is smart enough to determine the type of variable to be
 * used, this facility is called as type inference.
 * 
 * @author rgederin
 * 
 */
public class GenericsMethods {
	// Generics in method
	public static <T> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static void main(String args[]) {
		GenericType<String> g1 = new GenericType<>();
		g1.set("Pankaj");

		GenericType<String> g2 = new GenericType<>();
		g2.set("Pankaj");

		@SuppressWarnings("unused")
		boolean isEqual = GenericsMethods.<String> isEqual(g1, g2);
		// above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		// This feature, known as type inference, allows you to invoke a generic
		// method as an ordinary method, without specifying a type between angle
		// brackets.
		// Compiler will infer the type that is needed
	}
}
