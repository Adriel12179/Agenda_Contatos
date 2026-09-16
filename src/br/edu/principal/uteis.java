package br.edu.principal;

import java.util.Scanner;

public class uteis {
	  public static void mostraInicializacao() {
	    	System.out.println("==========================");
	        System.out.println("     AGENDA DE CONTATOS    ");
	        System.out.println("          v1.0.0           ");
	        System.out.println("==========================");
	        System.out.println("Bem-vindo!");
	    }
	    
	    public static void mostraMenu() {
	    	System.out.println();
	        System.out.println("1 - Adicionar contato");
	        System.out.println("2 - Listar contatos");
	        System.out.println("3 - Procurar contato");
	        System.out.println("4 - Alterar contato");
	        System.out.println("5 - Excluir contato");
	        System.out.println("6 - Sair");
	    }
	    
	    public static int selecionaOpcao(Scanner sc) {
	    	System.out.print("Escolha uma opção: ");
	        int opc = sc.nextInt();
	        sc.nextLine();
	        return opc;
	    }
	    public static void sair(boolean continuar) {
	    	System.out.println("Saindo da Agenda de Contatos...");
	        continuar = false;
	    }
}
