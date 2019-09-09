import java.util.Scanner;

class Projeto001 {
	public static void main(String[] args) {
		while(1 == 1) {
			Scanner exo = new Scanner(System.in);
			System.out.println("\nImforma o numero do exercicio: ");

			int confirma = exo.nextInt();
			
			if (confirma == 1){
			
				//Exo # 001
			
				Scanner p = new Scanner(System.in);
				System.out.println("Digite um valor: ");
				int valor = p.nextInt();
				System.out.println("Voce digitou o valor " + valor + ".");
			}

			
			if (confirma == 2){
			
				//Exo 001
			
				Scanner lassnome = new Scanner(System.in);
				System.out.println("Oi qual eh o seu nome?: ");
				String nom = lassnome.nextLine();
				System.out.println(nom + ", a UFFS eh melhor!!!");
			}
			

			if (confirma == 3){
			
				//Exo 002
			
				int i = 1;
				int b = 0;
				int qt = 3;
				while (i < qt) {
					Scanner vlr = new Scanner(System.in);
					System.out.println("Digite o valor "+i +": ");
					int num = vlr.nextInt();
					b += num;
					i++;
					if (i == qt) {
						System.out.println("A soma eh " + b + ".");
					
					}
				
				}
			
			}


			if (confirma == 4) {
				
				//Exo004

				Scanner frase = new Scanner(System.in);
				System.out.println("Digite uma frase qlq: ");

				String palavra = frase.nextLine();
				int dd = palavra.length();
				System.out.println("Essa frase tem " + dd + " letras.");

			}

			if (confirma == 5) {
				Scanner pala = new Scanner(System.in);
				System.out.println("Digite uma palavra: ");

				String fra = pala.nextLine();
				if (fra.contains("FERNANDO")) {
					System.out.println("Si Mestre!!!");
				}
				else{
					System.out.println("Vai trbalhar por favor!!!");
				}
			}


			if (confirma == 6) {
				Scanner inversa = new Scanner(System.in);
				System.out.println("Digite alguma coisa: ");

				String jirarPalavra = inversa.nextLine();
				
				int conta_letra = jirarPalavra.length();
				String reverso = "";
				
				for (int m = conta_letra - 1; m >= 0 ; m-- ) {
					reverso += String.valueOf(jirarPalavra.charAt(m));
					
				}
				
				System.out.println("\n <<<<< A inversa ficou asssim >>>>>\n\n\t" + reverso);
					
			}


			if (confirma == 0) {
				System.out.println("Ate logo!!!");
				break;
				
			}



		}

	}

}
