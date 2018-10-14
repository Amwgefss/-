import java.util.Scanner;
public class ตฺถþียสตัต2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number between 0 and 1000 :");
		int number=input.nextInt();
		int units=number%10;
		int inter=number/10;
		int tens=inter%10;
		int inters=inter/10;
		int hundreds=inters%10;
		int sum=units+tens+hundreds;
		System.out.println("The sum of all the Numbers is "+sum);
	}

}
