package qedge.june11;
public class Demo4 {
	public static void main(String[] args) {
		String str1 ="Hello";
		String str2="India";
		if(str1.equals(str2))
		{
			System.out.println("Strings are Equal::"+str1+"    "+str2);
		}
		else
		{
			try {
			throw new Error("Strings are Not Equal::"+str1+"    "+str2);
			}catch(Throwable t)
			{
				System.out.println(t.getMessage());
			}
		}

	}
}
