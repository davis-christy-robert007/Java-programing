package experiment1;
import java.util.Scanner;
public class Oddnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int num = sc.nextInt();
		for(int i=1;i<num;i++) {
			if(i%2==0) {
				continue ;
			}
			else {
				System.out.println(i);
			}
		
	}
}
}