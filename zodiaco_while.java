package while_cantina;

import java.util.Scanner;

public class zodiaco_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int dia,mess;
		System.out.println("Informe o dia em que voc� nasceu");
		dia = leitura.nextInt();
		
		System.out.println("Informe o m�s em que voc� nasceu");
		mess = leitura.nextInt();
		
		switch (mess) {
			case 1:
				if (dia<=20) {
					System.out.println("Capric�rnio");
				}
				else if(dia>=21 && dia<=31) {
					System.out.println("Aqu�rio");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 2:
				if (dia<=19) {
					System.out.println("Aqu�rio");
				}
				else if(dia>=20 && dia<=28) {
					System.out.println("Peixes");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 3:
				if (dia<=20) {
					System.out.println("Peixes");
				} 
				else if(dia>=21 && dia<=31) {
					System.out.println("�ries");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 4:
				if (dia<=20) {
					System.out.println("�ries");
				}
				else if(dia>=21 && dia<=30) {
					System.out.println("Touro");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 5:
				if (dia<=20) {
					System.out.println("Touro");
				}
				else if(dia>=21 && dia<=31) {
					System.out.println("G�meos");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 6:
				if (dia<=20) {
					System.out.println("G�meos");
				}
				else if(dia>=21 && dia<=30) {
					System.out.println("C�ncer");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 7:
				if (dia<=21) {
					System.out.println("C�ncer");
				}
				else if(dia>=22 && dia<=31) {
					System.out.println("Le�o");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 8:
				if (dia<=22) {
					System.out.println("Le�o");
				}
				else if(dia>=23 && dia<=31) {
					System.out.println("Virgem");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 9:
				if (dia<=22) {
					System.out.println("Virgem");
				}
				else if(dia>=23 && dia<=30) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 10:
				if (dia<=22) {
					System.out.println("Libra");
				}
				else if(dia>=23 && dia<=31) {
					System.out.println("Escorpi�o");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 11:
				if (dia<=21) {
					System.out.println("Escorpi�o");
				}
				else if(dia>=22 && dia<=30) {
					System.out.println("Sagit�rio");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			case 12:
				if (dia<=21) {
					System.out.println("Sagit�rio");
				}
				else if(dia>=22 && dia<=31) {
					System.out.println("Capric�rnio");
				}
				else {
					System.out.println("Dia inv�lido!");
				}
				break;
			default:
				System.out.println("M�s inv�lido!");
		}
		
		leitura.close();

	}

}
