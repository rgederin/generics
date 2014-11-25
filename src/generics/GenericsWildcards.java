package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(5);
		ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints=" + sum);
	}

	/**
	 * Now the problem with this implementation is that it won’t work with List
	 * of Integers or Doubles because we know that List<Integer> and
	 * List<Double> are not related, this is when upper bounded wildcard is
	 * helpful. We use generics wildcard with extends keyword and the upper
	 * bound class or interface that will allow us to pass argument of upper
	 * bound or it’s subclasses types
	 * 
	 * @param list
	 * @return
	 */
	public static double deprecatedSum(List<Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

	/**
	 * Generics Upper Bounded Wildcard Upper bounded wildcards are used to relax
	 * the restriction on the type of variable in a method. Suppose we want to
	 * write a method that will return the sum of numbers in the list, so our
	 * implementation will be something like thi
	 */

	/**
	 * It’s similar like writing our code in terms of interface, in above method
	 * we can use all the methods of upper bound class Number. Note that with
	 * upper bounded list, we are not allowed to add any object to the list
	 * except null. If we will try to add an element to the list inside the sum
	 * method, the program won’t comp
	 * 
	 * @param list
	 * @return
	 */
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}

	/**
	 * Generics Unbounded Wildcard
	 * 
	 * Sometimes we have a situation where we want our generic method to be
	 * working with all types, in this case unbounded wildcard can be used. Its
	 * same as using <? extends Object>.
	 * 
	 * @param list
	 */

	public static void printData(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + "::");
		}
	}

	/**
	 * Generics Lower Bounded Wildcard
	 * 
	 * Suppose we want to add Integers to a list of integers in a method, we can
	 * keep the argument type as List<Integer> but it will be tied up with
	 * Integers whereas List<Number> and List<Object> can also hold integers, so
	 * we can use lower bound wildcard to achieve this. We use generics wildcard
	 * (?) with super keyword and lower bound class to achieve this.
	 * 
	 * We can pass lower bound or any super type of lower bound as an argument
	 * in this case, java compiler allows to add lower bound object types to the
	 * list.
	 */

	public static void addIntegers(List<? super Integer> list) {
		list.add(new Integer(50));
	}
}
