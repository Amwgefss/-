package 黄青林17031110123;
import java.util.Scanner;
class MyPoint{
	Scanner input=new Scanner(System.in);
	private double x;
	private double y;
	private double x1;
	private double y1;
	void get(){
		this.x1=input.nextDouble();
		this.y1=input.nextDouble();
	}
	public MyPoint(){
		this.x=0;
		this.y=0;
	}
	public MyPoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double distance(){
		return Math.sqrt((this.x-this.x1)*(this.x-this.x1)+(this.y-this.y1)*(this.y-this.y1));
	}
	public double distance(double x,double y){
		return Math.sqrt((x-this.x1)*(x-this.x1)+(y-this.y1)*(y-this.y1));
	}
}
public class 第三章实训2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint point1=new MyPoint();
		point1.get();
		System.out.println("Thie distance is "+point1.distance());
	}

}
