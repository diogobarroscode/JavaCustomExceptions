package test;

import entities.Account;
import exceptions.BusinessException;

public class BusinessExceptionCase03Test {
	public static void main(String[] args) {
		
		int number = 8021;
		String holder = "Diogo Barros";
		double balance = 500.00;
		double withdrawLimit = 300.00;
		double amount = 800.00;
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		try {
			
			acc.withdraw(amount);
			System.out.printf("Saque realizado com sucesso! \nSaldo atual: %.2f%n", acc.getBalance());
			
		} catch (BusinessException e) {
			
			System.err.println(e.getMessage());
			
		}

	}
}
