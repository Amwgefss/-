
public class ตฺถþียสตัต7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int headCount=0;
		int tailCount=0;
		for(int i=0;i<1000000;i++){
			int number=(int)(Math.random()*2);
			if(number==0)
				headCount++;
			else
				tailCount++;
		}
		System.out.println("Head counts is "+headCount);
		System.out.println("Tail counts is "+tailCount);

	}

}
