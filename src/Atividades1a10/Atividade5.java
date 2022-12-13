package Atividades1a10;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int vet[] = new int[5];

		for(int i = 0; i<vet.length;i++) {
			System.out.println(i+1+". Digite n�mero: ");
			vet[i] = console.nextInt();
		}
		for(int i = 0; i<vet.length;i++) {	
			for(int x = 0; x<vet.length;x++) {
				if(i!=x) {
					if(vet[i] == vet[x]) {
						System.out.println("N�mero repetido: "+vet[i]+". Posi��o: "+i+" "+x);
					}
				}
			}
		}
	}
}