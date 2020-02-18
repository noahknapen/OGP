package square_root;

public class Sqrt {
	
	/**
	 *returns the square root, rounded down, of the given number
	 *
	 * @pre The given number is nonnegative
	 * 	| 0<= x
	 * 
	 * @post The square of the result is not greater than the given number
	 * 	| result*result <= x
	 *
	 */

	public static int sqrt(int x) {		//public maken zodat documentatie zichtbaar is voor iedereen bij index.html in javadoc
		int result = 0;
		while (result*result <= x)
			result++;
		
		return result-1;
	}

}
