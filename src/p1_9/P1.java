/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1000; i++)
		{
			if (i % 3 == 0||i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
	}

}
