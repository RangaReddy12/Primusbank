package qedge.june11;
import java.util.ArrayList;
public class Demo {
public static void main(String[] args) {
		// store weekdays into array list
		ArrayList<String> str = new ArrayList<String>();
		str.add("mon");
		str.add("tue");
		str.add("wed");
		str.add("thu");
		str.add("fri");
		str.add("sat");
		str.add("sun");
		System.out.println(str.get(6));
		for(String each : str)
		{
			System.out.println(each);
		}

	}
}
