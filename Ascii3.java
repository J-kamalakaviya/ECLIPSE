package PST;
import java.util.Scanner;
public class Ascii3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter:");
		char ch = sc.next().charAt(0);
	    Ab11 obj = new Ab11();
	    String str= null;
		obj.Ascii(str);
		sc.close();
	}
}

class Ab11{
	void Ascii(String str) {
		for(char i=0; i<str.length(); i++) {
		  char a =str.charAt(i);	
		  System.out.println("string"+(int)a);
		 
		}
		
		
	}
}


