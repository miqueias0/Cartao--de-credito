package Aplicação;

import java.util.Scanner;

import entidades.Conta;
import entidades.erro.Tratamento;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Entre com os dados da conta");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Proprietario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limiteSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero, nome, saldo, limiteSaque);
		System.out.println();
		System.out.println();
		
		System.out.print("Entre com a quantidade que ira sacar: ");
		Double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.print("Novo balanço: " + conta.getBalanco());
		
		}
		catch(Tratamento e) {
			System.out.print(e.getMessage());
		}
		
		
		
		sc.close();
	}

}
