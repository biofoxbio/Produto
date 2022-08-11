package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de funcionario ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado # " + i + " data ");
			System.out.print("Tercerizado ( y/n ) "  );
			char ch = sc.next().charAt(0);
			System.out.println("Nome !");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Horas :");
			double hours = sc.nextInt();
			System.out.println("Valor por Hora ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.println("Valor Adicional ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				
				list.add(new Employee ( name, hours, valuePerHour));
			}
		} 
	
		System.out.println();
		
		System.out.println("Pagamento ");
		for( Employee emp : list) {
			System.out.println(emp.getName() + " $ " + String.format("%.2f", emp.payment()));
		}
		sc.close();
	}

}
