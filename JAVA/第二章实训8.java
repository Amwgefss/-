package 黄青林17031110123;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.*;
public class 第二章实训8 {
	public static void addStudentName(String[] student){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<student.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的姓名");
			student[i]=input.next();
		}
	}
	public static void printStudentName(String[] student){
		for(int i=0;i<student.length;i++){
			System.out.println("第"+(i+1)+"个同学的姓名是"+student[i]);
		}		
	}
	public static void randonStudentName(String[] student){
		System.out.println("被点名的同学是"+student[new Random().nextInt(student.length)]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] student=new String[3];
		addStudentName(student);
		
		System.out.println("输入1查看所有学生姓名\n输入2随机点名\n输入0退出");
		int sign=1;
		while(sign!=0){
			sign=sc.nextInt();
			if(sign==1)
				printStudentName(student);
			else if (sign==2) {
				randonStudentName(student);
			}
			else if(sign==0)
				break;
			else {
			System.out.println("输入错误，请重新输入!");
			}
			
		}

	}

}
