package projeto_conta_bancaria;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Definindo o Locale para o Brasil
        Locale brasil = new Locale("pt", "BR");
		
		System.out.println("Digite o nome do cliente:");
		String nomeCliente = scanner.next();
		
		System.out.println("Qual o número da agência?");
		String agencia = scanner.next();
		
		System.out.println("Qual o número da conta?");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Qual o saldo do cliente?");
		double saldo = scanner.nextDouble();
		
		// Formatando o saldo como moeda brasileira
        String saldoFormatado = String.format(brasil, "R$ %.2f", saldo);
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
		System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldoFormatado + " já está disponível para saque!");
		scanner.close();
	}

}
