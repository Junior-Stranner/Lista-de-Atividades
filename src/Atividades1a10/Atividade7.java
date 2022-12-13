package Atividades1a10;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] pessoas = new String[10];
		int p ;
		pessoas[0] = "Junior";
		pessoas[1] = "Andreia";
		pessoas[2] = "Selmita";
		pessoas[3] = "Diana";
		pessoas[4] = "Allan";
		pessoas[5] = "Heinz";
		pessoas[6] = "Julio";
		pessoas[7] = "Messi";
		pessoas[8] = "Antony";
		pessoas[9] = "Keity";
		
		
		for(p = 0; p < pessoas.length ; p++) {	
			System.out.println("pessoas "+p+ ":" + pessoas[p] );
		}
		
		System.out.println("buscar pessoa");
		 String buscaP = in.nextLine();
		 
		 boolean encontrou = false;
		 
		 for(p = 0; p < pessoas.length ; p++) {	
			 if(pessoas[p].equalsIgnoreCase(buscaP)) {
				 encontrou = true;
				 break;
			 }
		 }
		 
		 if(encontrou == true) {
			 System.out.println(" achei a pessoa na posicao = "+p);
		 }else
			 System.out.println("nao encontrada");
	}

}
