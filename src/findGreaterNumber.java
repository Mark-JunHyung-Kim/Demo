/*
 Std Id : 300 318 553
 Std Name : (Mark) JunHyung Kim
 Date : 2020.05.12
 */

import java.util.Scanner;	// 항상 이걸 먼저 써줘야 스캐너를 쓸수있음
public class findGreaterNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1;		
		int num2;
		
		System.out.println("Please Enter the first number >>");
		num1 = input.nextInt();
		
		System.out.println("Please Enter the second number >>");
		num2 = input.nextInt();
		
		if (num1 < num2)		
			num1 = num2;
		
		System.out.println("The Greater number is >> "+ num1);		
		
	}

}
