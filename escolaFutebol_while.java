package while_cantina;

import java.util.Scanner;

public class escolaFutebol_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int idade;
		System.out.println (" escreva a sua idade: ");
		idade = leitura.nextInt();
		switch (idade) {
		case 6:
			System.out.println (" categoria dente de leite ");
		break;
		case 7:
			System.out.println (" categoria Júnior ");
		break;
		case 8:
			System.out.println (" categoria Júnior max");
		break;
		case 9:
			System.out.println (" categoria Júnior master ");
		break;
		case 10:
			System.out.println (" categoria Master ");
		break;
		default:
			System.out.println (" idade invalida ");
		}
		
		leitura.close();

	}

}
