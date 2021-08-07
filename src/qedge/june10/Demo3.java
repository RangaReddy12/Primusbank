package qedge.june10;

public class Demo3 {

	public static void main(String[] args) {
		// Store login data into two dimension
				Object login [][]= new Object[4][2];//four rows and two columns
				login[0][0]="Admin1";
				login[0][1]=54789;
				login[1][0]="Admin2";
				login[1][1]=58746;
				login[2][0]="Admin3";
				login[2][1]=5897;
				login[3][0]="Admin4";
				login[3][1]=74587;
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
