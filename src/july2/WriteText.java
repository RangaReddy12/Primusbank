package july2;
import java.io.*;
public class WriteText {
public static void main(String[] args)throws Throwable {
		//create new File
		File f = new File("d:/Eveng.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam so lazy to practise");
		bw.newLine();
		bw.write("But i want job in Top MNC");
		bw.newLine();
		bw.write("with 10L Package");
		bw.flush();
		bw.close();
	}
}
