/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p10_19;

public class P10 {

	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2000000; i++)
			if (isPrime(i))
				sum += i;
		System.out.println(sum);
	}
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		else if (n < 4)
			return true;
		else if (n % 2 == 0)
			return false;
		else if (n % 3 == 0)
			return false;
		else if (n < 9)
			return true;
		else
		{
			int x = (int) Math.sqrt(n);
			int c = 5;
			while (c <= x)
			{
				if (n % c == 0)
					return false;
				if (n % (c+2) == 0)
					return false;
				c += 6;
			}
			return true;
		}
	}

}
