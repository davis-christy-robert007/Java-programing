package experiment1;
import java.util.Scanner;
public class acceptMark {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entrer the mark");
		int mark =sc.nextInt();
		if(mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark>=75) {
			System.out.println("Grade B");
		}
		else if(mark>=60) {
			System.out.println("Grade C");
		}
		else if(mark>=40) {
			System.out.println("Grade D");
			
		}
		else if (mark<40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Output");
		}
	}
}
