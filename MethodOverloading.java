class shape{
	public int area(int side) {
		System.out.println("square");
		return side * side ;
	}
	public int area(int l,int b) {
		System.out.println("Rectangle");
		return l * b;
	}
	public float area(float radius) {
		System.out.println("Circle");
		return 3.14f * radius * radius;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println("Area of square :" + s1.area(10)+"sq.units");
		System.out.println("\n");
		System.out.println("Area of rectangle"+ s1.area(10, 20)+"sq.units");
		System.out.println("\n");
		System.out.println("Area of circle"+s1.area(10.00f)+"sq.units");
	}

}
