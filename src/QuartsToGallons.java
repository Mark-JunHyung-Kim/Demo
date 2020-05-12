/*
 Std Id : 300 318 553
 Std Name : (Mark) JunHyung Kim
 Date : 2020.05.12
 */

import java.util.Scanner;	// 항상 이걸 먼저 써줘야 스캐너를 쓸수있음
public class QuartsToGallons {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);		
		
		double quarts;		
		
		System.out.println("Enter number of quart >>");
		quarts = input.nextInt();
		
		System.out.println("Number of gallons >> " + (quarts/4));
		System.out.println("Number of quarts >> " + (quarts%4));
		
	}
}
