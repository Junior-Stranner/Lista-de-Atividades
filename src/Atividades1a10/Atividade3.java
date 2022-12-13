package Atividades1a10;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetA[] = new int[10];
		int vetM[] = new int[10];


		for(int i=0; i<=9;i++) {
			System.out.println(i+1+". Digite n�mero: ");
			vetA[i] =in.nextInt();
		}
		System.out.println("-------------------");
		System.out.println("Digite valor X: ");
		int x = in.nextInt();
	

		for(int i=0; i<=9;i++) {
			vetM[i] = vetA[i]*x;
			System.out.println(vetM[i]);
		}
	}
}