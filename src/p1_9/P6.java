/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P6 {

	public static void main(String[] args) {
		int s1 = 0; //sum of squares
		int s2 = 0; //square of sum
		for (int i = 1; i <= 100; i++)
		{
			s1 += (i*i);
			s2 += i;
		}
		System.out.println((s2*s2)-s1);
	}

}
