/*
 Std Id : 300 318 553
 Std Name : (Mark) JunHyung Kim
 Date : 2020.05.12
 */

import java.util.Scanner;	// �׻� �̰� ���� ����� ��ĳ�ʸ� ��������
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
