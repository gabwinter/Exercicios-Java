package Aula;

public class ContaCorrente {
	int numeroConta;
	String nomeBanco;
	String nomeCliente;
	float saldo;
	
	public void ContaCorrente() {
	}
	
	public void ContaCorrente(int numeroConta, String nomeBanco, String nomeCliente) {
		this.numeroConta = numeroConta;
		this.nomeBanco = nomeBanco;
		this.nomeCliente = nomeCliente;
	}
	
	public void depositar(float valor) {
		if (valor > 0) {
			saldo += valor;
		}
	}
	
	public boolean sacar(float valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} 
		else {
			System.out.println("Impossível sacar essa valor! ");
			return false;
		}
		
	}
	
	public void atualizarNomeCliente(String novo_nome_cliente) {
		nomeCliente = novo_nome_cliente;
	}
	
	public void atualizarBanco(String nome_novo_banco) {
		nomeBanco = nome_novo_banco;
	}
	
	public void atualizarNumeroDaConta(int novo_numero) {
		numeroConta = novo_numero;
	}
	
	public float obterSaldo() {
		return saldo;
	}
	
	public boolean verificarPossivelSaque(float valor) {
		if (valor > saldo) {
			return false;
		}
		else {return true;}
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", nomeBanco=" + nomeBanco + ", nomeCliente=" + nomeCliente
				+ ", saldo=" + saldo + "]";
	}
	
	
}
