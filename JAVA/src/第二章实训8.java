
import java.util.Random;
import java.util.Scanner;
public class 第二章实训8 {
	public static void addStudentName(String[] students) {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<students.length;i++) {
			System.out.print("存储第"+(i+1)+"个姓名：");
			students[i]=input.next();
		}
	}
	public static void printStudentName(String[] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println("第"+(i+1)+"个学生姓名："+students[i]);
		}
	}
	public static String randomStudentName(String[] students) {
		int index=new Random().nextInt(students.length);
		return students[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students=new String[3];
		addStudentName(students);
		printStudentName(students);
		String randomName=randomStudentName(students);
		System.out.println("被点到名的同学是："+randomName);
	}
}
