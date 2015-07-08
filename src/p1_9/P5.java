/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P5 {

	public static void main(String[] args) {
		long x = 21;
		while (true)
		{
		    boolean d = true;
		    for (int i = 1; i <= 20; i++)
		    {
		        d = true;
		        if (x % i != 0 )
		        {
		            d = false;
		            break;
		        }
		    }
		    if (d)
		    {
		        System.out.println(x);
		        break;
		    }
		    x++;
		}
	}
	
}
