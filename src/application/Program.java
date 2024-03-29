package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Informe o valor do saque: ");
		double amount = sc.nextDouble();
		System.out.println();
		
		
		//error handling using custom exception
		try {
			
			acc.withdraw(amount);
			System.out.printf("Saque realizado com sucesso! \nSaldo atual: %.2f%n", acc.getBalance());
			
		} catch (BusinessException e) {
			
			System.err.println(e.getMessage());
			
		} finally {
			
			sc.close();
			
		}


	}

}
