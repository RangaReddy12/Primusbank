package qedge.june10;
public class Demo1 {
public static void main(String[] args) {
		// Store login data into two dimension
		String login [][]= new String[4][2];//four rows and two columns
		//first row first column
		login[0][0]="Admin1";
		//first row second column
		login[0][1]="Ranga1";
		//second row first column
		login[1][0]="Admin2";
		//second  row second column
		login[1][1]="Ranga2";
		//third  row first column
		login[2][0]="Admin3";
		//third  row second column
		login[2][1]="Ranga3";
		//fourth  row first column
		login[3][0]="Admin4";
		//fourth  row second column
		login[3][1]="Ranga4";
		System.out.println("Row Lenght is::"+login.length);
		System.out.println("Column length in any row::"+login[0].length);
		//iterate all rows
		for(int i=0; i<login.length;i++)
		{
			//iterate all cells
			for(int j=0; j<login[i].length;j++)
			{
				System.out.print(login[i][j]+"\t");
			}
			System.out.println();
		}
	}
   }
