import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		int vetor3[] = new int[5];

		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor do primeiro vetor");
			vetor1[i] = input.nextInt();
		}

		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor do segundo vetor");
			vetor2[i] = input.nextInt();
		}

		for (int i = 0; i < vetor1.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}

		System.out.println("Print do primeiro vetor");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor1[i]);
		}

		System.out.println("Print do segundo vetor");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor2[i]);
		}

		System.out.println("Print do terceiro vetor");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor3[i]);
		}

	}

}
