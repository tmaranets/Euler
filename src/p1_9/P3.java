/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P3 {

	public static void main(String[] args) {
		long num = 600851475143l;
		boolean prime = false;
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				prime = true;
				for (int x = 2; x < i; x++)
				{
					if (i % x == 0)
						prime = false;
				}
				if (prime)
					System.out.println(i); //last ouput will be the solution
			}
		}
	}

}
