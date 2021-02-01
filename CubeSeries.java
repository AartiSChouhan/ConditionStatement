package Assessment1;

import java.util.Scanner;

public class CubeSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no.");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int cube= i*i*i;
			System.out.println(cube);
		}
		
	}

}
