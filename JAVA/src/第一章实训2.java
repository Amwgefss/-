import java.applet.*;
import java.awt.*;
public class 第一章实训2 extends Applet{

	/**
	 * @param g
	 */
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(0,0,150,225);
		g.setColor(new Color(174,63,215));
		g.drawString("姓名：黄青林", 20, 50);
		g.drawString("学号：17031110123", 20, 70);
	}

}
