package com.karolbelo;

import java.util.Random;
import java.util.Scanner;

public class Balanca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); 
		int opcao;

		
		System.out.println("////////////////////////////////////");
		System.out.println("///       JOGO DA BALAN�A        ///");
		System.out.println("////////////////////////////////////");
		System.out.println("1 - Jogar N�vel 1");
		System.out.println("2 - Jogar N�vel 2");
		System.out.println("3 - Sair");
		opcao = sc.nextInt();
		
		switch(opcao){
			case 1:
				int pesoEsquerdo = rand.nextInt(10)+1; 
				int pesoDireito = rand.nextInt(10)+1;	
				int maisPesado;
				char resposta = 'n';
				
				if(pesoEsquerdo == pesoDireito){
					System.out.println("| T |       | Q |");//c�digo da parte m�vel para T = Q;    
				    System.out.println("-----_______-----");//c�digo da parte m�vel para T = Q;    
				    System.out.println("        *");//c�digo superior da base para T = Q;	
				    System.out.println("       ***"); //c�digo inferior da base, nunca muda.
				    maisPesado = 0;
				    resposta = 'n';
				}else if(pesoEsquerdo > pesoDireito){
					System.out.println("            | Q |");//c�digo da parte m�vel para T < Q;    
				    System.out.println("| T |_______-----");//c�digo da parte m�vel para T < Q;    
				    System.out.println("-----   *");//c�digo superior da base para T < Q;11			    
				    System.out.println("       ***"); //c�digo inferior da base, nunca muda.
				    maisPesado = pesoEsquerdo;
				    resposta = 't';
				}else if(pesoEsquerdo < pesoDireito){
					System.out.println("| T |            ");//c�digo da parte m�vel para T > Q;    
				    System.out.println("-----_______| Q |");//c�digo da parte m�vel para T > Q;    
				    System.out.println("        *   -----");//c�digo superior da base para T > Q;
				    System.out.println("       ***"); //c�digo inferior da base, nunca muda.2
				    maisPesado = pesoDireito;
				    resposta = 'q';
				}
			System.out.println("Qual dos objetos � mais pesado?");
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
				//coloca o c�digo da fase 2 aqui
			case 3:
				System.out.println("Ok, at� mais!");
				break;
			default:
				System.out.println("Op��o inv�lida.");					
		}
	}
}   