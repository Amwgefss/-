import java.util.Scanner;
public class ตฺถþียสตัต4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a three-digit integer: ");
		int number=input.nextInt();
		int units=number%10;
		int hundred=number/100;
		if(hundred==0|number/1000!=0)
			System.out.println("Enter error!");
		else if(units==hundred)
			System.out.println(number+" is a palindrome.");
		else 
			System.out.println(number+" isn't a palindrome.");
	}

}
