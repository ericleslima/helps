package com.karolbelo;

import java.util.Random;
import java.util.Scanner;

public class Balanca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int opcao;

		
		System.out.println("////////////////////////////////////");
		System.out.println("///       JOGO DA BALANÇA        ///");
		System.out.println("////////////////////////////////////");
		System.out.println("1 - Jogar Nível 1");
		System.out.println("2 - Jogar Nível 2");
		System.out.println("3 - Sair");
		opcao = sc.nextInt();
		
		switch(opcao){
			case 1:
				int pesoEsquerdo = rand.nextInt(10)+1; 
				int pesoDireito = rand.nextInt(10)+1;	
				int maisPesado;
				char resposta = 'n';
				
				if(pesoEsquerdo == pesoDireito){
					System.out.println("| T |       | Q |");//código da parte móvel para T = Q;    
				    System.out.println("-----_______-----");//código da parte móvel para T = Q;    
				    System.out.println("        *");//código superior da base para T = Q;	
				    System.out.println("       ***"); //código inferior da base, nunca muda.
				    maisPesado = 0;
				    resposta = 'n';
				}else if(pesoEsquerdo > pesoDireito){
					System.out.println("            | Q |");//código da parte móvel para T < Q;    
				    System.out.println("| T |_______-----");//código da parte móvel para T < Q;    
				    System.out.println("-----   *");//código superior da base para T < Q;11			    
				    System.out.println("       ***"); //código inferior da base, nunca muda.
				    maisPesado = pesoEsquerdo;
				    resposta = 't';
				}else if(pesoEsquerdo < pesoDireito){
					System.out.println("| T |            ");//código da parte móvel para T > Q;    
				    System.out.println("-----_______| Q |");//código da parte móvel para T > Q;    
				    System.out.println("        *   -----");//código superior da base para T > Q;
				    System.out.println("       ***"); //código inferior da base, nunca muda.2
				    maisPesado = pesoDireito;
				    resposta = 'q';
				}
			System.out.println("Qual dos objetos é mais pesado?");
			System.out.println("t = Triangulo");
			System.out.println("q = Quadrado");
			System.out.println("n = Nenhum");

			char pergunta;
			pergunta = sc.next().charAt(0);
			
			while(pergunta != resposta){
				System.out.println("ERRRRROU!. Tente novamente!");
				System.out.println("t = Triangulo");
				System.out.println("q = Quadrado");
				System.out.println("n = Nenhum");
				
				pergunta = sc.next().charAt(0);
			}
			System.out.println("Acertou! Ah mizeravi...");
			
			break;
			case 2:
				//coloca o código da fase 2 aqui
			case 3:
				System.out.println("Ok, até mais!");
				break;
			default:
				System.out.println("Opção inválida.");					
		}
	}
}   