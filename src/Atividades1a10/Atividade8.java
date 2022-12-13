package Atividades1a10;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		float mediaSal = 0;
		int filhos = 0;
		int mediaF =0;
		float sal = 0;
		 float maiorSal = 0;
		float menorSal = 0;



		for(int x = 0 ; x < 3;x++) {
			System.out.print(" escreva o salario de cada Habitante =");
			sal = Float.parseFloat(in.nextLine()); 
			
			mediaSal =  mediaSal + sal/3;
		}
		for(int x = 0 ; x < 3;x++) {
			System.out.print(" numero de filhos dos habitantes =");
			filhos = Integer.parseInt(in.nextLine());

			mediaF= mediaF + filhos /3;

		}

		System.out.println("                ");
		if(sal >=2000) {
			System.out.println(" maior salario é "+sal);

		}
		if(sal < 1250) {
			menorSal++;
			System.out.println("quantidade de pessoas que recebem \n menos que 1250 reais ="+menorSal);
		}else { 
			System.out.println(" ninguem recebe abaixo de 1250 reais!");
		}

		System.out.println("Media Salarial dos habitante e = "+mediaSal);
		System.out.println("media de Filhos e ="+filhos);
	}
}
