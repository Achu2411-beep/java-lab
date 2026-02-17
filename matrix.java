import java.util.Scanner;
public class matrix{
	public static void main (String args[]){
		Scanner sc=new Scanner(System.in);
		int rows,column;
		System.out.println("Enter number of rows;");
		rows=sc.nextInt();
		System.out.println("Enter number of columns:");
		column=sc.nextInt();
		int arr[][]=new int[rows][column];
		System.out.println("Enter matrix elements:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<column;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is:");
		for (int i=0;i<rows;i++){
			for(int j=0;j<column;j++){
				System.out.print(arr[i][j]+" ");
			}
	System.out.println();	
		}
	}
}

