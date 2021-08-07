package qedge.june11;
public class Demo1 {
public static void main(String[] args) {
		// divide any thing with zero
		try {
		int x=45,y=0,z;
		z=x/y;
		System.out.println(z);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
			//t.printStackTrace();
		}
		double a=8765,b=8,c;
		c=a/b;
		System.out.println(c);
	}
}
