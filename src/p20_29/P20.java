/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p20_29;

import java.math.BigInteger;

public class P20 {

	public static void main(String[] args) {
		String ns = factorial(100).toString();
		int sum = 0;
		for (int i = 0; i < ns.length(); i++)
			sum += Integer.parseInt(ns.charAt(i)+"");
		System.out.println(sum);
	}
	public static BigInteger factorial(long n)
	{
		BigInteger bn = BigInteger.valueOf(n);
		if (bn.equals(BigInteger.valueOf(2)))
			return new BigInteger("2");
		else
			return bn.multiply(factorial(n-1));
	}

}
