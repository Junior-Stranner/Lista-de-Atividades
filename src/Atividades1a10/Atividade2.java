package Atividades1a10;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] aluno = new String[3];
		double[] nota = new double[3];
		int n = 0;
		int i;
		double[] media = new double[3];

		int m = 0;

		for (i = 0; i < 3; i++) {
			System.out.println("-----------------------");
			System.out.println(" Digite  nome do aluno");
			aluno[i] = in.nextLine();

			for (n = 0; n < 3; n++) {
				System.out.println(" digite nota do aluno ");
				nota[n] = Double.parseDouble(in.nextLine());
			}
			double soma = 0;
			for (n = 0; n < 3; n++) {
				soma += nota[n];
			}

			media[m] = (soma / 3);
			System.out.println("a nota do aluno :" + aluno[i] + " é = " + media[m]);

			m++;
		}

		for (i = 0; i < 3; i++) {
			aluno[i] = aluno[i] + media[i];
			System.out.println(" digite todas as medias dos alunos : " + aluno[i]);
		}
		calculaMediaTurma(media);
	}

	private static void calculaMediaTurma(double[] media) {
		double acimaMedia = 0;
		double abaixoMedia =0;
		double somaMedia=0;
		for(int i = 0; i< 3 ; i++) {
			somaMedia+=media[i];

		}
		double mediaTurma = somaMedia/3;

		for(int i = 0; i< 3 ; i++) {
			if(mediaTurma <= media[i]) {
				acimaMedia++;	
			}else {
				abaixoMedia++;
			}

		}
		System.out.println(" media geral ="+mediaTurma);
		System.out.println("acima ="+acimaMedia +"\n abaixo ="+abaixoMedia);
	}


}
