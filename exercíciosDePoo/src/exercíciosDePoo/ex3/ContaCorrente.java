package exercíciosDePoo.ex3;

import java.util.Scanner;

public class ContaCorrente {

	private int agencia;
	private int conta;
	private double saldo;
	private double operacao;
	private double valor;

	public ContaCorrente(int agencia, int conta, double saldo, double operacao, double valor) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.operacao = operacao;
		this.valor = valor;

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldoAtual, double saldo) {
		this.saldo = saldo;
	}

	public double getOperacao() {
		return operacao;
	}

	public void setOperacao(double operacao) {
		this.operacao = operacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	Scanner in = new Scanner(System.in);

	public void deposito(double valorDeposito) {
		double saldo = getSaldo();
		System.out.println("Seu saldo é R$: " + saldo);
		System.out.println("Deseja fazer um deposito? 1 - sim 2 - não");
		int escolha = in.nextInt();
		if (escolha == 1) {
			System.out.println("Aguarde...");
			this.saldo += valorDeposito;
			System.out.println("Seu saldo é R$: " + this.saldo);
		} else {
			System.out.println("Operação encerrada.");
		}
	}

	public void saque(double valorSaque) {
		double saldo = getSaldo();
		System.out.println("Seu saldo é R$: " + saldo);
		System.out.println("Deseja fazer um saque? 1 - sim 2 - não");
		int escolha = in.nextInt();
		if (escolha == 1) {
			System.out.println("Aguarde...");
			this.saldo -= valorSaque;
			System.out.println("Seu saldo é R$: " + this.saldo);
		} else {
			System.out.println("Operação encerrada.");
		}
	}

	public void saldo() {
		System.out.println("Seu saldo atual é: ");
		System.out.println("R$: " + getSaldo());
	}
}
