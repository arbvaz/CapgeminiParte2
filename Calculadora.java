package pacoteParte1;

import java.util.Scanner;
public class Calculadora {


	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		double valorInvest = 0;
		double visu;             // Visualiza��es por compartilhamento usadas no la�o de repeti��o
		double somaVisu = 0;     // Somat�rio das visualiza��es
		double visuOrig;         // Visualiza��es Originais
		int i;
		
		System.out.print("Informe o valor que deseja investir com an�ncios : R$ " );
		valorInvest = valor.nextDouble();
		
		visu = valorInvest * 30;
		visuOrig = visu;    // Salvar o n�mero de visualiza��es originais antes de entrar no la�o
		
		for (i = 0 ; i <= 3; i++) {   // La�o para calcular as visualiza��es at� 4 compartilhamentos e ir somando ao final
		
		visu = visu * 0.12 ;  // Pegar� 12%  das visualiza��es que ir�o clicar
		visu = visu * 0.15;   // Pegar� 15% dos que clicaram e ir�o compartilhar
		visu = visu * 40;     // Multiplica os que compartilharam pelas novas visualiza��es
	    somaVisu = visu + somaVisu;  // Soma o total de visualiza��es do compartilhamento anterior com o pr�ximo
		
		}
		
		System.out.println("Seu investimento de R$" + valorInvest + " trar� " + visuOrig + " visualiza��es originais e " + somaVisu + " visualiza��es a partir de compartilhamento");
		System.out.println("Totalizando : " + (visuOrig + somaVisu) + " Visualiza��es" );

	}

}
