package Computação_grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class Desenhar extends JFrame {

	public Desenhar() {
		 
		/*Costrutor resposavel por gerar nosso ambiente de desenho*/
		 Scanner input = new Scanner(System.in);
		System.out.println("digite a largura da sua tela");
		int larg = input.nextInt();
		System.out.println("digite a altura da sua tela");
		int alt =  input.nextInt();
		setSize(alt,larg);/*Determina o tamanho da tela*/
		setLocationRelativeTo(null);/*centraliza a tela*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);/*termina o programa ao ser fechado*/
		setVisible(true);/*permite visualização*/
		
	}
	
	
	public  void limpar_tela() {

		Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
		g.clearRect(0, 0, 10000, 10000);/*função resevada da bliblioteca 
										que limpa a tela*/
		 
		 }
	
	
public  void equacao_geral() {

	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	 int x, x0, xf, y0, yf;
	 float y, m;
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("digite o valor do x inicial");
	 x0=input.nextInt();
	 System.out.println("digite o valor do y inicial");
	 y0=input.nextInt();
	 System.out.println("digite o valor do x final");
	 xf=input.nextInt();
	 System.out.println("digite o valor do y final");
	 yf=input.nextInt();
	 
	 
	 m = (yf - y0)/(xf - x0);
	 for (x = x0; x <= xf; x++) {
	 y = y0 + m * (x - x0);
	 g.setColor( Color.BLACK );/*Cor do desenho*/
	 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
	 
	 }
	
}		

public void equacao_diferecial(){
	
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int x, x0, xf, y0, yf;
	float y, m;
	Scanner input = new Scanner(System.in);
	 
	 System.out.println("digite o valor do x inicial");
	 x0=input.nextInt();
	 System.out.println("digite o valor do y inicial");
	 y0=input.nextInt();
	 System.out.println("digite o valor do x final");
	 xf=input.nextInt();
	 System.out.println("digite o valor do y final");
	 yf=input.nextInt();
	
	 y=y0;
	 m = (yf - y0)/(xf - x0);
	 for (x = x0; x <= xf; x++) {
	 y = y + m ;
	 g.setColor( Color.BLACK );/*cor do desenho*/
	 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
	 }
}	
	
public void BRESENHAN (){
	Graphics g = getGraphics();
	int x, x0, xf, y0, yf,p,y;
	float dx,dy,c1,c2;
	Scanner input = new Scanner(System.in);
	 
	 System.out.println("digite o valor do x inicial");
	 x0=input.nextInt();
	 System.out.println("digite o valor do y inicial");
	 y0=input.nextInt();
	 System.out.println("digite o valor do x final");
	 xf=input.nextInt();
	 System.out.println("digite o valor do y final");
	 yf=input.nextInt();
	 
	 dx=xf-x0;
	 dy=yf-y0;
	 p=(int) (2*(dy-dx));
	 c1=2*dy;
	 c2=2*(dy-dx);
	 y=y0;
	 for (x = x0; x <= xf; x++) {
		 if(p<0) {
			 p=(int) (p+c1);
		 }
		 else {
			 p=(int) (p+c2);
			 y=y+1;
		 }
	 g.setColor( Color.BLACK );/*cor do desenho*/
	 g.drawLine(x, y, x, y);/*desenha o pixel*/
	 }
}



	public static void main(String[] args) {
		int opcao;
		
		/*inicializa um objeto Desenhar*/
		Desenhar d = new Desenhar();
		Scanner input = new Scanner(System.in);		
		
		while(true) {
			/*Mostra o menu ao usuário*/
			System.out.printf("[0] LIMPAR TELA \n" + 
			"[1] ALGORITMO RETA: EQUACAO GERAL \n" + 
			"[2] ALGORITMO RETA: EQUACAO DIFERENCIAL \n"
			+ "[3] ALGORITMO RETA: BRESENHAN \n" +
			"[4] SAIR \n");
			
			/*recebe a opção do usuário */
			opcao = input.nextInt();
			
			if (opcao == 0) {
				System.out.println(" Limpar tela "); 
				d.limpar_tela();
			}
			if (opcao == 1) {
				
				System.out.println(" Equação geral ");
				d.equacao_geral();
				
			}
			if (opcao == 2) {
				System.out.println(" Equação diferencial ");
				d.equacao_diferecial();
			}
			if (opcao == 3) {
				System.out.println(" Bresenhan ");
				d.BRESENHAN();
			}
			
			if (opcao == 4) {
				 System.exit(0);
			}
		}	
	}
}
