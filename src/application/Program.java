package application;

import java.util.Locale;
import java.util.Scanner;

import entity.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;

		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit(y/n)?");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Enter initial deposit value:");
			double deposito = sc.nextDouble();

			conta = new ContaBancaria(number, nome, deposito);
		} else {
			conta = new ContaBancaria(number, nome);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		deposito = sc.nextDouble();
		conta.levantar(deposito);
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();

	}

}
