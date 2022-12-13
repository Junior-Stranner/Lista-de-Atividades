package Atividades1a10;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num[] = new int[5];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 1;
		num[4] = 4;

		for (int i = 0; i < 5; i++) {
			System.out.println("num" + "[" + i + "]" + " = " + num[i]);
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int x = i + 1; x < num.length; x++) {
				if (num[i] == num[x]) {
					System.out.println("numeros repetidos na posicao" +i + " " +x);
				}
			}
		}
	}

}
