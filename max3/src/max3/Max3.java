package max3;

public class Max3 {
	
	/**
	 * Returns the maximum of the given numbers.
	 * 
	 * @post the result equals one of the given number.
	 * 		| result == i || result == j || result == k
	 * @post the result is not less than any of the given numbers.
	 * 		| i <= result || j <= result || k <= result
	 */
	
	public static int max3(int i, int j, int k) {
		
		if (i<j)
			if (j<k)
				return k;
			else
				return j;
		else
			if (i < k)
				return k;
			else
				return i;
	}

}
