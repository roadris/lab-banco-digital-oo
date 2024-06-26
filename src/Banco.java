import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contasCorrente;
	private List<Conta> contasPoupanca;

	public Banco (String nome){
		this.nome = nome;
		contasCorrente = new ArrayList<>();
		contasPoupanca = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarContaCorrentes(Conta contaCorrente){
		this.contasCorrente.add(contaCorrente);
	}

	public void exibirContasCorrente(){
		if(!contasPoupanca.isEmpty()){
			System.out.println("Exibir Contas Correntes.");
				for(Conta cr : contasCorrente){
					System.out.println(cr.cliente.getNome());
					System.out.println("Agência: " + cr.getAgencia());
					System.out.println("número: " + cr.getNumero());
					System.out.println("Saldo: " + cr.getSaldo());
				}
		}
		
	}

	public void adicionarContaPoupanca(Conta contaPoupanca){
		this.contasPoupanca.add(contaPoupanca);
	}

	public List<Conta> gContaCorrentes(){
		return contasCorrente;
	}

	public List<Conta> gContaPoupanca(){
		return contasPoupanca;
	}

	public void exibirContasPoupanca(){
		if(!contasPoupanca.isEmpty()){
			System.out.println("Exibir Contas Poupança.");
				for(Conta cp : contasPoupanca){
					System.out.println(cp.cliente.getNome());
					System.out.println("Agência: " + cp.getAgencia());
					System.out.println("número: " + cp.getNumero());
					System.out.println("Saldo: " + cp.getSaldo());
				}
		}
		
	}

	public boolean validarConta(int agencia, int numeroConta){
		if(!contasCorrente.isEmpty()){
			for(Conta cc : contasCorrente){
				if(cc.getAgencia() == agencia && cc.getNumero() == numeroConta){
					return true;
				}
			}
		}else if(!contasPoupanca.isEmpty()){
			for( Conta cp : contasPoupanca){
				if(cp.getAgencia() == agencia && cp.getNumero() == numeroConta){
					return true;
				}
			}
		}else{
			System.out.println("Conta inválida.");
		}
		return false;
	}
}
