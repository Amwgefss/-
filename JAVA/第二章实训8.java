package ������17031110123;
import java.awt.image.SinglePixelPackedSampleModel;
import java.util.*;
public class �ڶ���ʵѵ8 {
	public static void addStudentName(String[] student){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<student.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ��������");
			student[i]=input.next();
		}
	}
	public static void printStudentName(String[] student){
		for(int i=0;i<student.length;i++){
			System.out.println("��"+(i+1)+"��ͬѧ��������"+student[i]);
		}		
	}
	public static void randonStudentName(String[] student){
		System.out.println("��������ͬѧ��"+student[new Random().nextInt(student.length)]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] student=new String[3];
		addStudentName(student);
		
		System.out.println("����1�鿴����ѧ������\n����2�������\n����0�˳�");
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
			System.out.println("�����������������!");
			}
			
		}

	}

}
