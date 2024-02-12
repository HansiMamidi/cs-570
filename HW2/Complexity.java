//Mamidi Sri Naga Hansi

import java.util.*;

public class Complexity {

	//Method with time complexity n^2
	public static void n_square(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.println("Loop 1 Iteration:"+i+"\tLoop 2 Iteration:"+j);
			}
		}
	}
	
	//Method with time complexity n^3
	private static void n_cube(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				for(int k=1;k<=n;k++) {
					System.out.println("Loop 1 Iteration:"+i+"\tLoop 2 Iteration:"+j+"\tLoop 3 Iteration:"+k);
				}
			}
		}		
	}
	
	//Method with time complexity log(n)
	private static void n_logarithm(int n) {
		for(int i=1;i<n;) {
			System.out.println("Iteration:"+i);
			i=i*2;
		}
	}
	
	//Method with time complexity n*log(n)
	private static void n_multipleLogarithm(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;) {
				System.out.println("Loop 1 Iteration:"+i+"\tLoop 2 Iteration:"+j);
				j=j*2;
			}
		}	
	}
	
	//Method with time complexity n*log(n)
	private static void doubleLogarithm(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;) {
				System.out.println("Loop 1 Iteration:"+i+"\tLoop 2 Iteration:"+j);
				j=j*2;
			}
			i=i*2;
		}	
	}
	//Method with time complexity 2^n
	private static int two_powerN(int n) {
		int count=0;
		for(int i=1;i<=Math.pow(n, 2);i++) {
			count+=1;
		}	
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int n=sc.nextInt();
		
		System.out.println("\nMethod 1 - Below is the output that takes time complexity n^2");
		n_square(n);		//call to method with time complexity n^2
		
		System.out.println("\nMethod 2 - Below is the output that takes time complexity n^3");
		n_cube(n);			//call to method with time complexity n^3
		
		System.out.println("\nMethod 3 - Below is the output that takes time complexity log(n)");
		n_logarithm(n);		//call to method with time complexity log(n)
		
		System.out.println("\nMethod 4 - Below is the output that takes time complexity n*log(n)");
		n_multipleLogarithm(n);	//call to method with time complexity n*log(n)
		
		System.out.println("\nMethod 5 - Below is the output that takes time complexity log(log(n))");
		doubleLogarithm(n);		//call to method with time complexity log(log(n))
		
		System.out.println("\nMethod 6 - Below is the output that takes time complexity 2^n");
		int result = two_powerN(n);			//call to method with time complexity 2^n
		System.out.println("Result: "+result);
		sc.close();
	}
}
