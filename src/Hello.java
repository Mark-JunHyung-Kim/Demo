
import java.util.Scanner;	// �׻� �̰� ���� ����� ��ĳ�ʸ� ��������
public class Hello {

	public static void main(String[] args)
	{
		/*
		 System.out.print(myAge + "\n\n");	// println�̶� print�� writeline�̶� write�� ������.
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
