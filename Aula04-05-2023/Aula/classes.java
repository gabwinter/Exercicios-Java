package Aula;

import Aula.ContaCorrente;
import java.util.Locale;
import java.util.Scanner;


public class classes {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Iniciando nossa classe da conta corrente!");
		ContaCorrente novaConta = new ContaCorrente();
//		
//		System.out.print("Informe o numero da conta: ");
//		int numeroConta = input.nextInt();
//		
//		System.out.print("Informe o nome do banco: ");
//		String nomeBanco = input.next();
//		
//		System.out.print("Informe seu nome: ");
//		String nomeCliente = input.next();
//		
//		novaConta.ContaCorrente(numeroConta, nomeBanco, nomeCliente);
		
		int numConta = 1000;
		String banco = "Banco do Brasil";
		String nome = "Lucas";
		
		novaConta.ContaCorrente(numConta, banco, nome);
		
		while (true) {
			System.out.println("ESCOLHA UMA OPÇÃO: ");
			System.out.println("Opção 0 = Sair");
			System.out.println("Opção 1 = Sacar");
			System.out.println("Opção 2 = Depositar");
			System.out.println("Opção 3 = Verificar saldo");
			System.out.println("Opção 4 = Mudar numero da conta");
			System.out.println("Opção 5 = Mudar nome na conta");
			int resp = input.nextInt();
			
			if (resp == 1) {
				System.out.print("Informe o valor para sacar: ");
				int valor_para_saque = input.nextInt();
				novaConta.sacar(valor_para_saque);
			}
			
			if (resp == 2) {
				System.out.print("Informe o valor para depositar: ");
				int valor_para_deposito = input.nextInt();
				novaConta.depositar(valor_para_deposito);
			}
			
			if (resp == 3) {
				System.out.println();
			}
			System.out.print("Informe um valor para depositar: ");
			float valor_deposito = input.nextFloat();
			System.out.println("Você digitou " + valor_deposito);
			
			novaConta.depositar(valor_deposito);
			System.out.println(novaConta.obterSaldo());
			
			System.out.print("Digite um valor para sacar: ");
			float valor_saque = input.nextFloat();
			boolean response = novaConta.verificarPossivelSaque(valor_saque);
			
			if (response == true) {
				System.out.println("Saque concluído!");
				novaConta.sacar(valor_saque);
				System.out.println("Saldo restante: " + novaConta.getSaldo());
			}
			else {
				System.out.println("Impossível sacar, valor acima ao saldo!!");
				System.out.println(novaConta.getSaldo());
			}
			
			System.out.println(novaConta.toString());
			}
		

	}
}

