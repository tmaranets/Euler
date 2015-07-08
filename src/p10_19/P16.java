/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p10_19;

import java.math.BigInteger;

public class P16 {

	public static void main(String[] args) {
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		String ns = n.toString();
		int sum = 0;
		for (int i = 0; i < ns.length(); i++)
		{
			if (Character.isDigit(ns.charAt(i)))
				sum += Integer.parseInt(ns.charAt(i)+"");
		}
		System.out.println(sum);
	}

}
