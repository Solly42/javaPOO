package exercíciosDePoo.ex1;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String nome = "";
		String email = "";
		String telefone = "";
		
		Pessoa info = new Pessoa ("", "", "");
		
		System.out.println("Digite seu nome: ");
		nome = in.nextLine();
		info.setNome(nome);
		
		System.out.println("Digite seu email: ");
		email = in.nextLine();
		info.setEmail(email);
		
		System.out.println("Digite seu telefone");
		telefone = in.nextLine();
		info.setTelefone(telefone);
		
		info.mostraInfos();
		
		
	}

}
