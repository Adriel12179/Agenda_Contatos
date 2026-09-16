package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        int opcao;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        uteis.mostraInicializacao(); 

        while (continuar) {
        	uteis.mostraMenu();
            opcao = uteis.selecionaOpcao(sc);

            switch (opcao) {
                case 1-> agenda.adicionar(sc, nomes, celulares, emails);           	
                case 2-> agenda.listar(nomes, celulares, emails);
                case 3-> agenda.pesquisar(sc, nomes, celulares, emails);
                case 4-> agenda.atualizar(sc, nomes, celulares, emails);           	
                case 5-> agenda.excluir(sc, nomes, celulares, emails);          	
                case 6-> uteis.sair(continuar);
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
    
    