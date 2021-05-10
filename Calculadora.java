package pacoteParte1;

import java.util.Scanner;
public class Calculadora {


	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double valorInvest = 0;
		double visu;             // Visualizações por compartilhamento usadas no laço de repetição
		double somaVisu = 0;     // Somatório das visualizações
		double visuOrig;         // Visualizações Originais
		int i;
		
		System.out.print("Informe o valor que deseja investir com anúncios : R$ " );
		valorInvest = valor.nextDouble();
		
		visu = valorInvest * 30;
		visuOrig = visu;    // Salvar o número de visualizações originais antes de entrar no laço
		
		for (i = 0 ; i <= 3; i++) {   // Laço para calcular as visualizações até 4 compartilhamentos e ir somando ao final
		
		visu = visu * 0.12 ;  // Pegará 12%  das visualizações que irão clicar
		visu = visu * 0.15;   // Pegará 15% dos que clicaram e irão compartilhar
		visu = visu * 40;     // Multiplica os que compartilharam pelas novas visualizações
	    somaVisu = visu + somaVisu;  // Soma o total de visualizações do compartilhamento anterior com o próximo
		
		}
		
		System.out.println("Seu investimento de R$" + valorInvest + " trará " + visuOrig + " visualizações originais e " + somaVisu + " visualizações a partir de compartilhamento");
		System.out.println("Totalizando : " + (visuOrig + somaVisu) + " Visualizações" );

	}

}
