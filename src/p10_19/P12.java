/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p10_19;

public class P12 {

	public static void main(String[] args) {
		long x = 0;
		int i = 1;
		while (true)
		{
			x += i;
			if (getDivs(x) > 500)
			{
				System.out.println(x);
				break;
			}
			i++;
		}
	} 
	public static int getDivs(long n)
	{
		int divs = 0;
		for (int i = 1; i < (int) Math.sqrt(n); i++)
		{
			if (n % i == 0)
				divs+=2;
		}
		return divs;
	}

}
