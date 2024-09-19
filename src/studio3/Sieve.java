package studio3;
import java.util.Scanner;


public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n? ");
		int n = in.nextInt();
		int[] numbers=new int[n];
		for(int e=0;e<numbers.length;e++) {
			numbers[e]=e+1;
		}
		boolean[] A = new boolean[n];
		for(int b=0;b<numbers.length;b++) {
			A[b]=true;
		}
		for(int i=2;i<((int)Math.sqrt(n)+1);i++) {
			if (A[i]=true) {
				for(int j=0;j<n;j=j+i) {
					A[j]=false;
				}
			}

		}
		for(int d=0;d<n;d++) {
			if (A[d]==true) {
				System.out.print(numbers[d]+" ");
			}
		}
	}

}
