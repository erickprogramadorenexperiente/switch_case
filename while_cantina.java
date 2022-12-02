package while_cantina;

import java.util.Scanner;

public class while_cantina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leitura = new Scanner (System.in);
        int preco;
        
        System.out.println (" escreva o código do produto: ");
        preco = leitura.nextInt();
        switch(preco) {
        case 1:
			System.out.println("Cachorro quente: R$8,00");
			break;
		case 2:
			System.out.println("Cheeseburger: R$12,00");
			break;
		case 3:
			System.out.println("X-Salada: R$15,00");
			break;
		case 4:
			System.out.println("Misto Quente: R$11,00");
			break;
		case 5:
			System.out.println("Pão na chapa: R$6,00");
			break;
		default:
			System.out.println("Código inválido!");
        }
        
        leitura.close();
	}

}
