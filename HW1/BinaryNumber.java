// Mamidi_Sri_Naga_Hansi
// Using the Big-Endian format for binary numbers
import java.util.*;

public class BinaryNumber {
	private int data[]= {1,0,1,1};
	public int z=1011;
	public String str1,str;
	private boolean overflow;
	
	//Constructor for creating a binary number given a string
	public BinaryNumber(int length) {
		String str2="";
		for(int i=0;i<length;i++) {
			str2=str2+"0";
		}
		this.str=str2;
		System.out.println(str);
	}

	//Constructor for creating a binary number given a string
	public BinaryNumber(String str) {
		int len = str.length();
		int bin[];
		bin = new int[len];  
		for (int i =0; i< len; i++) {
			char ch = str.charAt(i);
			int n = Character.getNumericValue(ch);
			bin[i] = n;		
		}
		for (int i =0 ; i< len; i++) {
			System.out.print(bin[i]);
		}
		System.out.println();
	}
	
	//Method for determining the length of a binary number
	public int getLength() {
		return data.length;	
	}
	
	//Method for obtaining a digit of a binary number given an index
	public int getDigit(int index) {
		try {
			return data[index];
		}
		catch (Exception e ) {
			System.out.println(e.getMessage());
		}
		return -1;
	}

	//Method for shifting all digits in a binary number any number of places to the right with zeroes
	public void shiftR(int amount) {
		String str1="",str2="";
		for(int i=0;i<amount;i++) {
			str2=str2+"0";
		}
		
		for(int i=0;i<data.length;i++) {
			str1=str1+data[i];
		}
		System.out.println(str2+str1);
	}
	
	//Method for adding two binary numbers

	public void add(String b1,String b2) {
		int addition = 0;
		int len1=String.valueOf(b1).length();
		int len2=String.valueOf(b2).length();
		if(len1!=len2) {
			System.out.println("Lengths not matching");
		}
		else {
			//converting string to integer of base 2   
		    int bin1 = Integer.parseInt(b1, 2);
		    int bin2 = Integer.parseInt(b2, 2);
		    addition = bin1 + bin2;
		    System.out.println(Integer.toBinaryString(addition));
		}
		
		if(len1!=String.valueOf(addition).length()) {
			overflow = true;
		}
	}
	
	//Method for transforming a binary number to a String
	public String toString() {
		try {
			return Integer.toString(z);
		}
		catch (StackOverflowError ex ) {
			return "Overflow";
		}
	} 
	
	//Method for transforming a binary number to its decimal notation
	public int toDecimal(int bin) {
		 int num = 0;  
		    int i = 0;  
		    while(bin!=0){  
		      if(bin == 0){  
		        break;  
		      } else {  
		          int rem = bin%10;  
		          num += rem*Math.pow(2, i);  
		          bin = bin/10;  
		          i++;  
		       }  
		    }  
		    return num;  
	}
	
	//Method to clear overflow flag
	public void clearOverflow() {
		overflow = false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Creating a binary number of given length consisting only zeroes
		System.out.println("Enter a length of binary number zero to be printed:");
		int length = sc.nextInt();
		BinaryNumber bnint=new BinaryNumber(length);
			
		//Creating a binary number given a string
		System.out.println("Enter a string for binary conversion:");
		String str=sc.next();
		BinaryNumber bnstr=new BinaryNumber(str);
		
		
		//Determining the length of a binary number
		System.out.println("Length of the binary number:"+bnint.getLength());
		
		//Obtaining a digit of a binary number given an index
		System.out.println("Enter the index of digit to be retrieved:");
		int index=sc.nextInt();
		System.out.println(bnint.getDigit(index));
		
		//Transforming a binary number to its decimal notation
		System.out.println("Enter the binary number for decimal conversion:");
		int bin = sc.nextInt();
		System.out.println(bnint.toDecimal(bin));
		
		//Shifting all digits in a binary number any number of places to the right with zeroes
		System.out.println("Enter the number of places to shift:");
		int amount=sc.nextInt();
		bnint.shiftR(amount);
		
		//Adding two binary numbers
		System.out.println("Enter 2 binary numbers for adding:");
		String x=sc.next();
		String y=sc.next();
		bnint.add(x,y);
	
		//Clears the overflow flag
		bnint.clearOverflow();
		
		//Transforming a binary number to a String
		str = bnint.toString();
		System.out.println("Converting binary number to string:"+str);
	}

}
