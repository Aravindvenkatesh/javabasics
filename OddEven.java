package javabasics;

import java.util.Scanner;

public class OddEven {
	static int n;
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the input");
	int n =scan.nextInt();
	if(	n%2==0)
	{
		System.out.println("Even");
		
	}else if( n%2!=0)
	{
		System.out.println("Odd");
	}else
	{
		System.out.println("The input is invalid");
	}
}
}
