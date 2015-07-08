/*
 *	code written by Theodore Maranets 	-	https://github.com/tmaranets
 */
package p10_19;

public class P17 {

	public static void main(String[] args) {
		int len = 0;
		for (int i = 1; i <= 1000; i++)
		{
			len += getWord(i).length();
		}
		System.out.println(len);
	}
	public static String getWord(int n)
	{
		String ns = n+"";
		if (ns.length()==1)
			return chooseSiNum(n);
		else if (ns.length()==4)
			return "onethousand";
		else 
		{
			if (ns.length()==3 && ns.substring(1).equals("00"))
				return chooseSiNum(Integer.parseInt(ns.charAt(0)+"")) + "hundred";
			else if (ns.length()==3)
				return chooseSiNum(Integer.parseInt(ns.charAt(0)+"")) + "hundredand" + getWord(Integer.parseInt(ns.substring(1)));
			else if (ns.length()==2 && (ns.charAt(0)+"").equals("1"))
				return chooseTeen(Integer.parseInt(ns.charAt(1)+""));
			else if (ns.length()==2 )
				return chooseDiNum(Integer.parseInt(ns.charAt(0)+"")) + getWord(Integer.parseInt(ns.substring(1)));
		}
		return null;
	}
	public static String chooseSiNum(int n)
	{
		switch (n)
		{
		case 0: return "";
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		}
		return null;
	}
	public static String chooseDiNum(int n)
	{
		switch (n)
		{
		case 0: return "";
		case 1: return "";
		case 2: return "twenty";
		case 3: return "thirty";
		case 4: return "forty";
		case 5: return "fifty";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninety";
		}
		return null;
	}
	public static String chooseTeen(int n)
	{
		switch (n)
		{
		case 0: return "ten";
		case 1: return "eleven";
		case 2: return "twelve";
		case 3: return "thirteen";
		case 4: return "fourteen";
		case 5: return "fifteen";
		case 6: return "sixteen";
		case 7: return "seventeen";
		case 8: return "eighteen";
		case 9: return "nineteen";
		}
		return null;
	}
}
