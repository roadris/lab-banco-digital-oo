import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		//atributos
		Cliente novoClientePoupanca = new Cliente();
		Cliente novoClienteCorrente = new Cliente();
		Banco novoBanco = new Banco("Bank GFT");
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("\nCRIAR CONTA CORRENTE");
		System.out.print("\nInforme o nome da pessoa: ");
		novoClienteCorrente.setNome(teclado.nextLine());
		Conta novaContaCorrente = new ContaCorrente(novoClienteCorrente);
		novoBanco.adicionarContaCorrentes(novaContaCorrente);
		
		System.out.println("\nCRIAR CONTA POUPANÇA");
		System.out.print("\nInforme o nome da pessoa: ");
		novoClientePoupanca.setNome(teclado.nextLine());
		Conta novaContaPoupanca = new ContaCorrente(novoClientePoupanca);
		novoBanco.adicionarContaPoupanca(novaContaPoupanca);

		System.out.println("\nDigite o valor deposito");
		novaContaCorrente.depositar(teclado.nextDouble());
		System.out.println("\nDigite o valor que deseja transferir para a conta poupança");
		novaContaCorrente.transferir(teclado.nextDouble(), novaContaPoupanca);
		
		novaContaCorrente.imprimirExtrato();
		novaContaPoupanca.imprimirExtrato();

		
		novoBanco.exibirContasPoupanca();
		novoBanco.exibirContasCorrente();
	}

}
