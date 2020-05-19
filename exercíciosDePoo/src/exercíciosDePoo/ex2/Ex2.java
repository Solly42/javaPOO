package exercíciosDePoo.ex2;

import java.util.Scanner;

import exercíciosDePoo.ex1.Pessoa;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
		String nome = "";
		int ano = 0;
		
		Pessoa2 anoNascimento = new Pessoa2 ("", 0);
		
		System.out.println("Digite seu nome: ");
		nome = in.nextLine();
		anoNascimento.setNome(nome);
		
		System.out.println("Digite  o ano que você nasceu: ");
		ano = in.nextInt();
		anoNascimento.setAno(ano);
		
		anoNascimento.mostraAno();
		anoNascimento.calculaIdade50();
	}

}
