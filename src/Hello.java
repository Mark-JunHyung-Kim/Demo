
import java.util.Scanner;	// 항상 이걸 먼저 써줘야 스캐너를 쓸수있음
public class Hello {

	public static void main(String[] args)
	{
		/*
		 System.out.print(myAge + "\n\n");	// println이랑 print는 writeline이랑 write의 차이임.
		 */
		int age = 36;
		String name = "Mark Kim";		
				
				
		System.out.println("Hello! My Age is = " + age + " and Name is = " + name);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your Age >> ");
		age = input.nextInt();
		input.nextLine();
		
		System.out.println("What is your Name >> ");
		name = input.nextLine();
				
		
		System.out.println("Hello! My Age is = " + age + " and Name is = " + name);
		
		
	}
}
