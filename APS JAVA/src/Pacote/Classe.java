
package Pacote;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Classe {
	public static void main(String[] args) {
	
	
		// Declaração das Variaveis
		int i = 0, continuar, estrategia, resposta, comparsa, contadorTrair = 0, contadorCooperar = 0, TrairxTrair = 0,
				CooperarxCooperar = 0, TrairxCooperar = 0;
		boolean Menu, Jogou = false;
		String SemPerdao, SairRelatorio;
		int[] acumulador = new int[3];

		while (true) {

			System.out.println("-------- MENU DE ESTRATÉGIA -------- \n");
			// Operador Ternário - mesma coisa do IF
			SairRelatorio = (Jogou == true) ? "6- Sair / Relatório" : "6- Sair";

			// Menu da estratégia
			System.out.println(
					"Qual estratégia deseja utilizar:\n 1- Não Iterado            2- Olho por olho \n 3- Olho por dois olhos    4- Provador Ingênuo\n 5- Retaliador Permanente  "
							+ SairRelatorio);
			Menu = true; // Deixa os Switch Case disponiveis

			Scanner entrada = new Scanner(System.in);
			estrategia = entrada.nextInt();

			switch (estrategia) {
			case 1: // Não Iterado

				Jogou = true; // Mostra que teve alguma ação no jogo

				while (Menu == true) {

					// numeros aleatório
					comparsa = (int) (1 + Math.random() * 2);

					// Pergunta
					System.out.println("Você vai trair ou Cooperar? \n 1- Trair  2- Cooperar");
					Scanner Estrategia1 = new Scanner(System.in);
					resposta = Estrategia1.nextInt();

//Valida resposta
					if (resposta > 2 || resposta < 1) {

						for (i = 0; resposta > 2 || resposta < 1; i++) {
							System.out.println("- Valor inválido! \n");
							break;
						}

					} else {

						if (resposta == 1 && comparsa == 1) {
							// Trair x Trair

							System.out.println("- Você foi condenado a 5 anos de prisão. \n");
							TrairxTrair++;
							acumulador[0] = TrairxTrair;

						} else if (resposta == 2 && comparsa == 1) {
							// Trair x Cooperar

							System.out.println("- Você foi condenado a 10 anos de prisão. \n");
							TrairxCooperar++;
							acumulador[2] = TrairxCooperar;

						} else if (resposta == 1 && comparsa == 2) {
							// Trair x Cooperar

							System.out.println("- Seu Comparsa foi condenado a 10 anos de prisão. \n");
							TrairxCooperar++;
							acumulador[2] = TrairxCooperar;

						} else if (resposta == 2 && comparsa == 2) {
							// Cooperar x Cooperar

							System.out.println("- Você foi condenado a 2 anos de prisão. \n");
							CooperarxCooperar++;
							acumulador[1] = CooperarxCooperar;

						} else {

						}
						// Pergunta
						System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
						Scanner conti1 = new Scanner(System.in);
						continuar = conti1.nextInt();

						// Caso a resposta seja invalida
						if (continuar > 2 || continuar < 1) {
							for (i = 0; continuar > 2 || continuar < 1; i++) {
								System.out.println("- Valor inválido! \n");
								System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
								continuar = conti1.nextInt();
							}
						}

						if (continuar == 2) {

							// Retorna para o Menu e Anula o Switch Case
							Menu = false;

						} else {

						}

					}
				}
			case 2: // Olho por olho
				Jogou = true; // Mostra que teve alguma ação no jogo

				while (Menu == true) {
					// Pergunta
					System.out.println("Você vai trair ou Cooperar? \n 1- Trair  2- Cooperar");
					Scanner Estrategia2 = new Scanner(System.in);
					resposta = Estrategia2.nextInt();

// Valida resposta
					if (resposta > 2 || resposta < 1) {

						for (i = 0; resposta > 2 || resposta < 1; i++) {
							System.out.println("- Valor inválido! \n");
							break;
						}

					} else {

						if (resposta == 1) {
							// Trair x Trair

							System.out.println("-- Você foi condenado a 5 anos de prisão. \n");
							TrairxTrair++;
							acumulador[0] = TrairxTrair;

						} else if (resposta == 2) {
							// CooperarxCooperar

							System.out.println("-- Você foi condenado a 2 anos de prisão. \n ");
							CooperarxCooperar++;
							acumulador[1] = CooperarxCooperar;

						} else {

							// Caso a resposta seja invalida
							System.out.println("Valor inválido! \n");

						}

						// Pergunta
						System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
						Scanner conti2 = new Scanner(System.in);
						continuar = conti2.nextInt();

						// Caso a resposta seja invalida
						if (continuar > 2 || continuar < 1) {
							for (i = 0; continuar > 2 || continuar < 1; i++) {
								System.out.println("- Valor inválido! \n");
								System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
								continuar = conti2.nextInt();
							}
						}
						if (continuar == 2) {

							// Retorna para o Menu e Anula o Switch Case
							Menu = false;

						} else {

						}
					}
				}

			case 3: // Olho por dois olhos
				Jogou = true; // Mostra que teve alguma ação no jogo

				while (Menu == true) {

					// Pergunta
					System.out.println("Você vai trair ou Cooperar? \n 1- Trair  2- Cooperar");
					Scanner Estrategia3 = new Scanner(System.in);
					resposta = Estrategia3.nextInt();

// Valida resposta
					if (resposta > 2 || resposta < 1) {

						for (i = 0; resposta > 2 || resposta < 1; i++) {
							System.out.println("- Valor inválido! \n");
							break;
						}

					} else {

						if (resposta == 1) {
							contadorTrair++;
							if (contadorTrair > 2) {
								// Trair x Cooperar

								System.out.println("- Seu Comparsa foi condenado a 10 anos de prisão. \n");
								contadorTrair = 0;
								TrairxCooperar++;
								acumulador[2] = TrairxCooperar;

							} else if (contadorTrair <= 2) {
								// Trair x Trair

							System.out.println("- Você foi condenado a 5 anos de prisão. \n");
								contadorCooperar = 0;
								TrairxTrair++;
								acumulador[0] = TrairxTrair;

							} else {

								// Caso o valor seja invalido
								System.out.println("Valor inválido! \n");
							}

						} else if (resposta == 2) {
							contadorCooperar++;
							if (contadorCooperar > 2) {
								// Trair x Cooperar

								System.out.println("- Você foi condenado a 10 anos de prisão. \n");
								contadorCooperar = 0;
								TrairxCooperar++;
								acumulador[2] = TrairxCooperar;

							} else if (contadorCooperar <= 2) {
								// Cooperar x Cooperar

								System.out.println("- Você foi condenado a 2 anos de prisão.\n");
								contadorTrair = 0;
								CooperarxCooperar++;
								acumulador[1] = CooperarxCooperar;
							} else {

								// Caso o valor seja invalido
								System.out.println("Valor inválido! \n");
							}

						}

						// Pergunta
						System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
						Scanner conti3 = new Scanner(System.in);
						continuar = conti3.nextInt();

						// Caso a resposta seja invalida
						if (continuar > 2 || continuar < 1) {
							for (i = 0; continuar > 2 || continuar < 1; i++) {
								System.out.println("- Valor inválido! \n");
								System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
								continuar = conti3.nextInt();
							}
						}
						if (continuar == 2) {

							// Retorna para o Menu e Anula o Switch Case
							Menu = false;

						} else {

						}

					}
				}

			case 4: // Provador Ingênuo
				Jogou = true; // Mostra que teve alguma ação no jogo

			case 5: // Retaliador Permanente
				Jogou = true;// Mostra que teve alguma ação no jogo

				SemPerdao = "Comparsa"; // Inicialização da estratégia

				while (Menu == true) {

					// Pergunta
					System.out.println("Você vai trair ou Cooperar? \n 1- Trair  2- Cooperar");
					Scanner Estrategia5 = new Scanner(System.in);
					resposta = Estrategia5.nextInt();

// Valida resposta
					if (resposta > 2 || resposta < 1) {

						for (i = 0; resposta > 2 || resposta < 1; i++) {
							System.out.println("- Valor inválido! \n");
							break;
						}

					} else {

						if (resposta == 2 && SemPerdao == "Comparsa") {
							// Cooperar x Cooperar

							System.out.println("- Você foi condenado a 2 anos de prisão. \n");
							CooperarxCooperar++;
							acumulador[1] = CooperarxCooperar;

						} else if (resposta == 1 && SemPerdao == "Traidor") {
							// Trair x Trair

							System.out.println("- Você foi condenado a 5 anos de prisão. \n");
							SemPerdao = "Traidor";
							TrairxTrair++;
							acumulador[0] = TrairxTrair;

						} else if (resposta == 1) {
							// Trair x Cooperar

							System.out.println("- Seu Comparsa foi condenado a 10 anos de prisão. \n");
							// Inicia a estrategia - Sempre será traido!
							// Quando a resposta é Trair
							SemPerdao = "Traidor";
							TrairxCooperar++;
							acumulador[2] = TrairxCooperar;

						} else if (resposta == 2 && SemPerdao == "Traidor") {
							// Trair x Cooperar

							System.out.println("- Você foi condenado a 10 anos de prisão. \n");
							SemPerdao = "Traidor";
							TrairxCooperar++;
							acumulador[2] = TrairxCooperar;

						} else {

							// Caso o valor seja invalido
							System.out.println("Valor inválido! \n");
						}
						System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
						Scanner conti5 = new Scanner(System.in);
						continuar = conti5.nextInt();

						// Caso a resposta seja invalida
						if (continuar > 2 || continuar < 1) {
							for (i = 0; continuar > 2 || continuar < 1; i++) {

								System.out.println("- Valor inválido! \n");
								System.out.println("Deseja continuar a estrátegia? \n 1- Sim  2- Não ");
								continuar = conti5.nextInt();
							}
						}
						if (continuar == 2) {
							// Retorna a para o Menu e Anula o Switch Case
							Menu = false;

						} else {
						}
					}
				}
			case 6: // Sair / Relatório

				if (Menu == true && Jogou == true) {

					// Relatorio
					System.out.println("------------ RELATÓRIO ------------- \n");

					// Declaração das Variaveis
					double PorcentagemTRAIRxTRAIR, PorcentagemTRAIRxCooperar, PorcentagemCooperarxCooperar, total = 0,
							NumTrairxTrair = acumulador[0], NumCoopxCoop = acumulador[1],
							NumTrairxCooperar = acumulador[2];

					// Total das Respostas
					total = NumCoopxCoop + NumTrairxCooperar + NumTrairxTrair;

					// Porcentagem
					PorcentagemTRAIRxTRAIR = (NumTrairxTrair / total) * 100;
					PorcentagemCooperarxCooperar = (NumCoopxCoop / total) * 100;
					PorcentagemTRAIRxCooperar = (NumTrairxCooperar / total) * 100;

					// Double com dois decimais
					DecimalFormat df = new DecimalFormat("0.##");

					// Mostrar o Relatorio
					System.out.println("Trair    x Trair    = " + NumTrairxTrair + " - "
							+ df.format(PorcentagemTRAIRxTRAIR) + " % \nTrair    x Cooperar = " + NumTrairxCooperar
							+ " - " + df.format(PorcentagemTRAIRxCooperar) + " % \nCooperar x Cooperar = "
							+ NumCoopxCoop + " - " + df.format(PorcentagemCooperarxCooperar)
							+ " % \n\nTOTAL               = " + total + " - 100 %");

					// Termina o jogo
					System.out.println("----------- FIM DO JOGO ------------ \n");
					System.exit(1);

				} else if (Menu == true) {

					// Termina o jogo sem Relario
					System.out.println("----------- FIM DO JOGO ------------ \n");
					System.exit(1);

				} else if (Menu == false) {

					// Retorna para o Menu e Anula o Switch Case
					Menu = false;
				}

			default:

				// Caso a Estratégia seja invalida
				System.out.println("Estratégia inválido!");
				break;
			}
		}
	}


	
	}
