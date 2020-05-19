package exercíciosDePoo.ex3;

public class Ex3 {
	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente(0, 0, 1000, 0, 0);

		conta1.deposito(100);
		conta1.saque(50);
		conta1.saldo();

	}
}
