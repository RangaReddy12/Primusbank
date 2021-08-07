package qedge.june10;
public class Demo {
public static void main(String[] args) {
		// store different types of datatypes in single dimension
		Object str []= new Object[5];
		str[0]=100;
		str[1]="India";
		str[2]=234.456;
		str[3]='c';
		str[4]=true;
		for(Object each : str)
		{
			System.out.println(each);
		}

	}

}
