package Atividades1a10;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

			int vet[] = new int[7];
		    int i, maior, posMaior, menor, posMenor;
		    
		    Scanner ler = new Scanner(System.in);
		    
		    for (i = 0; i < 7; i++) {
		    	System.out.println("Digite um numero: ");
				vet[i] = Integer.parseInt(ler.nextLine());
			}
		    for (i = 0; i < 7; i++) {
		    	System.out.println("Valor: "+ vet[i]);
		    }

		    maior    = vet[0];
		    posMaior = 0;
		    for (i = 1; i < 7; i++) {
		        if (vet[i] > maior) {
		            maior    = vet[i];
		            posMaior = i;
		        }
		    }

		    menor    = vet[0];
		    posMenor = 0;
		    for (i = 1; i < 7; i++) {
		        if (vet[i] < menor) {
		            menor    = vet[i];
		            posMenor = i;
		        }
		    }
		    System.out.println(" ");
		    System.out.println("Vetor ");
		    System.out.println(" ");
		    for (i = 0; i < 7; i++) {
		    	System.out.println("Valor: "+ vet[i]);
		    }

		    System.out.println("\nMaior valor: - posicao: " + maior);
		    System.out.println("\nMenor valor: - posicao: " + menor);

		    return;
		}

	}
