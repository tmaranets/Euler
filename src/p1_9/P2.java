/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P2 {

	public static void main(String[] args) {
		int[] prev = {1,2};
		int sum = 2;
		int x = prev[0]+prev[1];
		while (x<4000000)
		{
			x = prev[0]+prev[1];
			prev[0]  = prev[1];
			prev[1] = x;
			if (x % 2 == 0)
				sum += x;
		}
		System.out.println(sum);
	}

}
