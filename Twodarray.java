import java.util.Scanner;

public class Twodarray {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no of row");
		int rows = sc.nextInt();
		System.out.println("enter the no of cols");
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];
		int[][] transpose = new int [cols][rows];
		
		System.out.println("enter the elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
				transpose[j][i] =matrix[i][j];
		}
			}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
				
			}
			System.out.println();
	
		}
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[i][j]+"\t");
				
			}
			System.out.println();
	
		}
	}
}


