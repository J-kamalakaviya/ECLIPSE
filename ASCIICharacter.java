package PST;
import java.util.Scanner;
public class ASCIICharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        Ascii obj = new Ascii();
        obj.findChar( ch);
			
		}
	}


class Ascii{
    void findChar(char ch) {
       int ascii = ch;
        System.out.println( "  ch  " + ascii);
    }
}