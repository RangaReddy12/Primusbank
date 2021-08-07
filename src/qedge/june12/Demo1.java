package qedge.june12;
public class Demo1 {
	//Global variables
public static int x,y,z;
public static double a,b,c;
public static void addition()
{
	x=87765;
	y=87;
	z=x+y;
	System.out.println("Addition is::"+z);
}
public static void mul()
{
	x=98765;
	y=76;
	z=x*y;
	System.out.println("Multiplication::"+z);
}
public static void floatingDiv()
{
	a=87655434;
	b=987;
	c=a/b;
	System.out.println("Floating division::"+c);
}
public void sub()//non static method
{
	x=87765;
	y=87;
	z=x-y;
	System.out.println(z);
}
	public static void main(String[] args) {//main method
		//calling static methods with class name
		Demo1.floatingDiv();
		Demo1.addition();
		Demo1.mul();
		//creating reference object to call non static methods
		Demo1 d= new Demo1();
		d.sub();
			}
}


