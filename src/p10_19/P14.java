/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p10_19;

public class P14 {

	public static void main(String[] args) {
		long longest = 0;
		long snum = 1;
		for (int i = 13; i < 1000000; i++)
		{
			long n = collatz(i,0);
			if (n > longest)
			{
				longest = n;
				snum = i;
			}
		}
		System.out.println(snum);
	}
	public static long collatz(long n, long count) //returns length of sequence
	{
		if (n==1)
			return (count+1);
		if (n % 2 == 0)
			return collatz(n/2, count + 1);
		else 
			return collatz((3*n)+1, count + 1);
	}

}
