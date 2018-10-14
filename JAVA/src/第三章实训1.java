package 黄青林17031110123;
import java.util.Scanner;
class RectObject{
	public static final double WIDTH=1;
	public static final double HEIGHT=1;
	public double width;
	public double height;
	public RectObject(){
	}
	public double getArea(){
		return 1.0*this.width*this.height;
	}
	public double getPerimeter(){
		return 2.0*(this.width+this.height);
	}
	
}
public class 第三章实训1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		RectObject rect=new RectObject();	
		rect.width=input.nextDouble();
		rect.height=input.nextDouble();
		System.out.println(rect.getArea());
		System.out.println(rect.getPerimeter());
		
	}

}
