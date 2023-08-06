//Edited By - Ritik Arvind Bansod

import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		System.out.println("Enter two number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the operation sign to perform (+,-,*,/)");
		char c = sc.next().charAt(0);

		switch(c){
			case '+': System.out.println("Addition : "+ (a+b));
				  break;
			case '-': System.out.println("Subtration : "+(a-b));
				  break;
			case '*': System.out.println("Multiplication : "+(a*b));
				  break;
			case '/': System.out.println("Division : "+(a/b));
				  break;
		}
	}
}

