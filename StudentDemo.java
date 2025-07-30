package demo ; 
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	Student(int rollNumber,String name,int m1,int m2,int m3){
		this.rollNumber = rollNumber;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public void calculateAvrage() {
		avg = (m1+m2+m3)/3;
	}
	public void displayDetails() {
		System.out.println("Roll Number:" + rollNumber);
		System.out.println("Name:" + name);
		System.out.println("Mark1:" + m1);
		System.out.println("Mark2 :"+ m2);
		System.out.println("Mark3 :"+ m3);
		System.out.println("Average: " + avg);

		
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		Student stu1 = new Student(17,"ALEX",100,100,98);
		stu1.calculateAvrage();
		stu1.displayDetails();
		Student stu2 = new Student(01,"Abhijith",100,100,89);
		stu2.calculateAvrage();
		stu2.displayDetails();
		Student stu3 = new Student(18,"Alwin",100,100,100);
		stu3.calculateAvrage();
		stu3.displayDetails();

	}

}
