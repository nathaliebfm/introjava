package familia58;

import java.util.Scanner;

public class IntroJava {

	public static void main(String[] args) {

		double n1,n2,n3,media;
		int op;
		
		
		Scanner leia = new Scanner(System.in); // Isso transformará o Scanner em leia e o in lerá o que for inserido
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("\nMédia Aritmética: " + media); //println só aceita o + e o f só aceita a , para concatenar
		System.out.printf("\nMédia Aritmética: %.2f", media); //Assim puxa o número para dentro da frase e também já arredonda, de acordo com o número entre o % e o F

		if(media>=7 && media<=10) {//&& funciona como o e do Portugol
			System.out.println("\nAluna Aprovada!!!");
		}else if (media>=5 && media<7) {
			System.out.println("Aluna de Exame!!!");
		}else {
			System.out.println("Aluna reprovada!!!");
		}
		
		System.out.println("\n\t\tMenu de incentivos");
		System.out.println("\n1- Você vai aprender!");
		System.out.println("\n2- Já deu certo!");
		System.out.println("\n3- Vai dar bom!");
		System.out.println("\n4- Com dedicação você vai além!");
		
		System.out.println("\nDigite a sua opção: ");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("\nVocê vai aprender!");
			break;
		case 2:
			System.out.println("\nJá deu certo!");
			break;
		case 3:
			System.out.println("\nVai dar bom!");
			break;
		case 4:
			System.out.println("\nCom dedicação você vai além!");
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 4);
		
		
	} // em estruturas dentro do Java não tem o ; , fechando-as com a chave

}
