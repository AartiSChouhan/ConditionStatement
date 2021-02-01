package Assessment1;

import java.util.Scanner;

public class NumSum {
	public static void main(String[] args) {
		System.out.println("Enter any no:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of the given no is: "+sum);
	}

}
