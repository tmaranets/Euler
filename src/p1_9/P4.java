/*
	code written by Theodore Maranets 	-	https://github.com/tmaranets
*/
package p1_9;

public class P4 {

	public static void main(String[] args) {
		int biggest = 0;
		for (int i = 100; i <= 999; i++)
		{
			for (int u = 100; u <= 999; u++)
			{
				String p = (i*u) + "";
				String r = "";
				for (int x = p.length()-1; x >= 0; x--)
					r += p.charAt(x);
				if (p.equals(r))
				{
					if ((i*u) > biggest)
						biggest = i*u;
				}
			}
		}
		System.out.println(biggest);
	}

}
