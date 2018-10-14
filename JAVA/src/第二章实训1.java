import java.util.Scanner;
public class ตฺถþียสตัต1 {
	final static double pi=3.1415926;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the radius of the cylinder : ");
		double radius=input.nextDouble();
		System.out.print("Please enter the height of the cylinder : ");
		double height=input.nextDouble();
		double area=pi*radius*radius;
		System.out.println("The cross product of this cylinder is "+area);
		double volume=area*height;
		System.out.println("The volume of this cylinder is "+volume);
		
		
	}

}
