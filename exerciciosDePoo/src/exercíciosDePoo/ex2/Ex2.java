package exerc�ciosDePoo.ex2;

import java.util.Scanner;

import exerc�ciosDePoo.ex1.Pessoa;

public class Ex2 {
	
	public static void main(String[] args) {
		Scanner in =  new Scanner (System.in);
		String nome = "";
		int ano = 0;
		
		Pessoa2 anoNascimento = new Pessoa2 ("", 0);
		
		System.out.println("Digite seu nome: ");
		nome = in.nextLine();
		anoNascimento.setNome(nome);
		
		System.out.println("Digite  o ano que voc� nasceu: ");
		ano = in.nextInt();
		anoNascimento.setAno(ano);
		
		anoNascimento.mostraAno();
		anoNascimento.calculaIdade50();
	}

}
