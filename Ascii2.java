package PST;
import java.util.Scanner;
public class Ascii2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter:");
		char ch = sc.next().charAt(0);
		String str = null;
	    Ab obj = new Ab();
	    obj.Ascii(str);
		sc.close();
	}

}
class Ab{
	void Ascii(String str) {
		for(char i=0; i<str.length(); i++) {
		  char a =str.charAt(i);	
		  System.out.println("string"+(int)a);
		 
		}
		
		
	}
}