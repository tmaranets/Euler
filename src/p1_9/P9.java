/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P9 {

	public static void main(String[] args) {
		boolean found = false;	
		for (int b = 2; b < 1000; b++)
		{
			for (int a = 1; a < b; a++)
			{
				double c = Math.sqrt((a*a) + (b*b));
				if (a+b+c==1000)
				{						
					System.out.printf("%f",(int)a*b*c); 
					found = true;
					break;
				}
			}
			if (found)
			{
				break;
			}
		}
	}

}
