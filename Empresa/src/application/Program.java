package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import application.entities.Employee;
import application.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		Integer numEmployee = sc.nextInt();

		
	//	Employee employee;
		
		for (int i = 0; i < numEmployee; i++) {
		
			System.out.print("Outsourced (y/n)? ");
			String yesOrNo = sc.next();
			
		if (yesOrNo.equals("y")) {
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hour = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuerPerhour = sc.nextDouble();
			
			System.out.print("Addtional charge: ");
			Double Add = sc.nextDouble();
			
									
			list.add(new OutsourcedEmployee(name, hour,
					valuerPerhour, Add));

		} else {

			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hour = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuerPerhour = sc.nextDouble();
			
					
			list.add(new Employee(name, hour, valuerPerhour));
				
			}
		}

		System.out.println("PAYMENTS: ");
		
		for (Employee employee : list) {
			
			System.out.print(employee.getName() + " - " 
			+ " $ " + String.format("%.2f", employee.payment()) + "\n" );			
		}
		
		sc.close();
	}

}
