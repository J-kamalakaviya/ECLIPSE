package PST;
import java.util.Scanner;
public class EvenOddCount {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int even = 0, odd = 0;

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();

	            if (arr[i] % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	        }

	        System.out.println("Number of even elements = " + even);
	        System.out.println("Number of odd elements = " + odd);

	        sc.close();
	    }
	}




