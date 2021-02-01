package Assessment1;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any number");
		 int flag=0;
		 
		 int number=sc.nextInt();
		 for(int i=1;i<=number;i++)
		 {
			 if(number%i==0)
			 {
				 flag++;
				 
			 }
		 }
		 if(flag==2)
		 
			 System.out.println("It is a prime no.");
		 
		 else
		 {
			 System.out.println("It is not a Prime no");
		 }
		 
	}
}
