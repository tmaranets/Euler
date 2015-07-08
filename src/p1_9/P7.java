/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P7 {

	public static void main(String[] args) {
		int c = 1;
		int x = 3;
		while (true)
		{
			if (isPrime(x))
				c++;
			if (c == 10001)
			{
				System.out.println(x); 
				break;
			}
			x++;
		}
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
