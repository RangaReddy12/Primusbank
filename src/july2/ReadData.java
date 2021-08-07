package july2;

import java.io.*;

public class ReadData {

	public static void main(String[] args)throws Throwable {
		FileReader fr =new FileReader("d:/Eveng.txt");
		BufferedReader br = new BufferedReader(fr);
	String str="";
	while((str=br.readLine())!=null)
	{
		Thread.sleep(2000);
		System.out.println(str);
	}
br.close();
	}

}
