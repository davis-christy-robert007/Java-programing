import java.util.Scanner;

public class Copyarray {
	public static void main(String[] args) {
		int array[] =new int[5];
		int copyarray[] =new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements of array:");
		for(int i=0;i<5;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			copyarray[i]=array[i];
		}
		 System.out.print("Original array: ");
	        for (int num : array) {
	            System.out.print(num + "\t");
	        }

	        System.out.println();
	        System.out.print("  Copied array: ");
	        for (int num : copyarray) {
	            System.out.print(num +"\t");
	}

}
}
