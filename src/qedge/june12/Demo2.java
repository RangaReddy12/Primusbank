package qedge.june12;
public class Demo2 {
public static void message()
{
	System.out.println("Message");
}
public static int add(int x, int y)
{
	int z=x+y;
	return z;
}
public static String compareStrings(String str1,String str2)
{
	String res="";
	if(str1.equalsIgnoreCase(str2))
	{
		res="Strings are Equal";
	}
	else
	{
		res="Strings are not Equal";
	}
	return res;
}
public static boolean comparevalue(int a, int b)
{
	if(a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Demo2.message();
		int c=Demo2.add(345, 45);
		System.out.println(c);
String results=Demo2.compareStrings("India", "india");
System.out.println(results);
boolean res =Demo2.comparevalue(800, 800);
System.out.println(res);
	}
}
