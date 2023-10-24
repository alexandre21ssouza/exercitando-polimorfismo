package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		Integer numberEmployees = sc.nextInt();
		
		System.out.print("Outsourced (y/n)? ");
		String yesOrNo = sc.next();
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		

	}

}
