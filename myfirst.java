import java.util.*;

public class myfirst {

   /* This is my first java program.  
    * This will print 'Hello World' as the output
    */
	
    public static void main(String []args) {
       System.out.println("Hello World"); // prints Hello World
	   
	  // Random num1 = new Random();
	   //int m  = num1.nextInt(900);
	   //System.out.println(m);
	   
	   int a, b, c, d;
	   double x, y, z;
	   
	   b = 3;
	   c = 7;
	   x = b/c;
	   
	   y=4;
	   z=5;
	   
	   d=(int)(y/z);
	   
	   System.out.println(d);
	   
	   int num1 = 456;
	   int num2 = num1/10;
	   int num3 = num2/10;
	   int num4 = num1 - num3 * 100;
	   System.out.println(num4);
	
	   String ss;
	   ss = perplexing("Hello");
	   System.out.println(ss);
	   
	   String ss_more;
	   ss_more = moreperplexing("Hello");
	   System.out.println(ss_more);
	   
	   int dd;
	   dd = unknown(4,2);
	   System.out.println("unknown: " + dd);
	   
	   stringA("sink");
	   
	   double aa = doubleA(7.0);
	   System.out.println ("double: " + aa);
	   
	   String cleanupStr = removeRecursive("cdcdabc", 'c');
	   System.out.println("new String: " + cleanupStr);
	   
	   weirdo(40);
	   
	   System.out.println("result: " + product(1));
	   
	   System.out.println("go result: " + go(3));
	   
	   stringB("cat");
    }
	
	public static void stringB(String str)
	{
		System.out.println(str.substring(str.length()-1));
		if (str.length()<6){
			stringB(str+str.substring(0,1));
		}
	}
	public static int go(int x){
		System.out.println("x: " + x);
		if (x<1) return 1;
		else return x + go(x-2) + go(x-3);
	}
	
	public static String perplexing (String s){
		if (s.length() ==1){
		return s;
		}
		System.out.print("input string: " + s);
		System.out.println("   substring: " + s.substring(1));
		return perplexing(s.substring(1)) + s.charAt(0);
	}
	
	public static String moreperplexing (String s){
		if (s.length() ==1){
		return s;
		}
		System.out.print("input string: " + s);
		System.out.println("   substring: " + s.substring(1));
		return moreperplexing(s.substring(1)) + s;
	}
		
		
	public static int unknown(int n, int r){
		System.out.println("n: " + n + "   r: " +r);
			if (n==0 || r<=0 || r>=n) {
				return 1;
			}
			return unknown(n-1, r-1)+unknown(n-1,r);
			
			
	}
	
	public static void stringA(String str)
	{
		if (str.length()>0)
		{
			stringA(str.substring(1));
			System.out.print(str);
		}
	}
	
	public static double doubleA(double d)
	{
		System.out.println("d: " + d);
		if (d/2 >= d-3)
			return d;
		else
			return d + doubleA(d-1);
	}
	
	public static String removeRecursive(String word, char ch)
	{ 
		int len = word.length(); 
		System.out.println("word: " + word);
		
		if (len == 0)
		{
			return word;
		}
		if (word.charAt(0) != ch)
		{
			return word.charAt(0) + removeRecursive(word.substring(1), ch);
			
		}
		else	
		{
			return removeRecursive(word.substring(1), ch);
		}
		
		
	} 
	
/*	public static String removeRecursive1(String word, String s2)
	{ 
		int len1 = s2.length();
		String newstr;
		char ch;
		
		for (int m=0; m< len1; m++)
		{
			ch = s2.charAt(0);
			
			int len = word.length(); 
			System.out.println("word: " + word);
			
			if (len == 0)
			{
				newstr = word;
				return newstr;
			}
			if (word.charAt(0) != ch)
			{
				newstr = word.charAt(0) + removeRecursive(word.substring(1), ch);
				return newstr; 
				
			}
			else	
			{
				newstr = removeRecursive(word.substring(1), ch);
				return newstr;
			}
			
			//return removeRecursive1(newstr, s2.substring(m));
		}
		
		return removeRecursive1(newstr, s2.substring(m));
	} */
	
	public static void weirdo(int a)
	{
		System.out.println(a + " ");
		
		if (a>1){
			weirdo(a/2);
		}
		
		System.out.println(a + " ");
			
	}
 
 public static int product(int num){
	 if (num>20) return -1;
	 else return num * product(-2*num);
 }

} 







