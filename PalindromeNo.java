package Assessment1;

import java.util.Scanner;

public class PalindromeNo {
	public static void main(String[] args) {
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r,sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("It is a Palindrome no");
		}
		else
		System.out.println("Not Palindrome");
	}


}
