import java.util.Scanner;
public class 第二章实训6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		String array[]={"剪刀","石头","布"};
		System.out.print("剪刀（0） 石头（1）布（2）\n请输入您的选择：");
		while(count!=2){
			String sult="";
			Scanner input=new Scanner(System.in);
			int computerNumber=(int)(Math.random()*3);
			int userNumber=input.nextInt();
			if(Math.abs(userNumber-computerNumber)==1)
				if(userNumber>computerNumber){
					sult="赢";
					count++;
				}
				else
					sult="输";
			else if(Math.abs(userNumber-computerNumber)==2)
				if(userNumber<computerNumber){
					sult="赢";
					count++;
				}
				else
					sult="输";
			else if(Math.abs(userNumber-computerNumber)==0)
				sult="们平局";
			else
				System.out.println("Enter error!");
			System.out.println("计算机的选择是"+array[computerNumber]+"，您的选择是"+array[userNumber]+",您"+sult+"了");
		}
	}
}
