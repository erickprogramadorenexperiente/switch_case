package while_cantina;

import java.util.Scanner;

public class nota_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		double i,r,b,mb,mbn, bn, rn, in;
		int total;
		String nota;
		
		System.out.println("Informe a quantidade de alunos na sala");
		total = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram MB");
		mb = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram B");
		b = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram R");
		r = leitura.nextInt();
		
		System.out.println("Informe a quantidade de alunos que tiraram I");
		i = leitura.nextInt();
		
		mbn = mb/total*100;
		bn = b/total*100;
		rn = r/total*100;
		in = i/total*100;
		
		if((mb+b+r+i)>total||(mb+b+r+i)<total) {
			System.out.println("Quantidade de alunos incorreta");
		}
		else {
			System.out.println("Insira a nota que deseja saber a porcentagem");
			nota = leitura.next();
			
			switch(nota) {
			case "MB":
				System.out.println("A porcentagem de alunos que tirou MB é de: "+mbn+"%");
				break;
			case "B":
				System.out.println("A porcentagem de alunos que tirou B é de: "+bn+"%");
				break;
			case "R":
				System.out.println("A porcentagem de alunos que tirou R é de: "+rn+"%");
				break;
			case "I":
				System.out.println("A porcentagem de alunos que tirou I é de: "+in+"%");
				break;
			default:
				System.out.println("Nota inexistente");

	   }
    }
		
		     leitura.close();
  }	
	
}	
