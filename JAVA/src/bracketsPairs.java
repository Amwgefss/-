package FirstApplet;
import java.util.Scanner;
public class bracketsPairs {
	public static int toInteger(char originalcharater) {
		int mid=0;
		switch (originalcharater) {
		case '(':mid=1;break;
		case ')':mid=9;break;
		case '[':mid=2;break;
		case ']':mid=8;break;
		case '{':mid=3;break;
		case '}':mid=7;break;
		case '<':mid=4;break;
		case '>':mid=6;break;
		default:mid=0;break;
		}
		return mid;
	}
	public static char[] extractTheParentheses(String originalString,int convertToIntegers[],int[] length) {
		char[] resultString=new char[originalString.length()];
		int j=0;
		for(int i=0;i<originalString.length();i++) {
			if (originalString.charAt(i)=='('|originalString.charAt(i)==')'|
					originalString.charAt(i)=='['|originalString.charAt(i)==']'|
					originalString.charAt(i)=='{'|originalString.charAt(i)=='}'|
					originalString.charAt(i)=='<'|originalString.charAt(i)=='>') {
				resultString[j]=originalString.charAt(i);
				convertToIntegers[j]=toInteger(resultString[j]);
				j++;
			}
		}
		length[0]=j;
		return resultString;
	}
	public static boolean bracketsChar(int[] convertToIntegers,int[] length) {
		if(length[0]==0)
			return true;
		else if(length[0]%2!=0) {
			return false;
		}
		boolean flag=false;
		int i=0,cont=length[0];
		while(cont!=0) {
			if(i>=length[0]-1) {
				if(!flag)
					return flag;
				i=0;
				flag=false;
				continue;
			}
			for(int j=i+1;convertToIntegers[i]!=0&convertToIntegers[i]<5;j++) {
				if(convertToIntegers[j]!=0) {
					if(convertToIntegers[i]+convertToIntegers[j]==10) {
						convertToIntegers[i]=convertToIntegers[i+1]=0;
						cont-=2;
						i+=2;
						flag=true;
					}
					else {
						break;
					}
				}
			}
			i++;
		}
//		for(int i=0,j=length[0]-1;i<j;j--,i++) {
//			if(convertToIntegers[i]+convertToIntegers[j]!=10) {
//				bracketsResult=false;
//				break;
//			}
//		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int[] length=new int[1];
		System.out.println("Please input this string!");
		String originalString=input.nextLine();
		int[] convertToIntegers=new int[originalString.length()];
		char[] resultString=extractTheParentheses(originalString,convertToIntegers,length);
		boolean reault=bracketsChar(convertToIntegers, length);
		System.out.println("bracketspairs is "+reault);
		System.out.println(resultString);
	}
}
