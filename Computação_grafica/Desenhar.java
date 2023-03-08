package Computação_grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class Desenhar extends JFrame {
	
	int alt,larg;
	

	public Desenhar(int alt,int larg) {
		 
		setSize(alt,larg);/*Determina o tamanho da tela*/
		setLocationRelativeTo(null);/*centraliza a tela*/
		setDefaultCloseOperation(EXIT_ON_CLOSE);/*termina o programa ao ser fechado*/
		setVisible(true);/*permite visualização*/
		
	}
	
	
	
	
	public int getAlt() {
		return alt;
	}




	public void setAlt(int alt) {
		this.alt = alt;
	}




	public int getLarg() {
		return larg;
	}




	public void setLarg(int larg) {
		this.larg = larg;
	}




	public  void limpar_tela() {

		Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
		g.clearRect(0, 0, 10000, 10000);/*função resevada da bliblioteca 
										que limpa a tela*/
		 
		 }
	
	
public  void equacao_geral() {

	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	 int x, x0, xf, y0, yf,aux;
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
	 
	 aux = xf-x0;
	 
	 if(x0==xf) {
		 aux = 1;
	 }
	 
	 m = (yf - y0)/(aux);
	 for (x = x0; x <= xf; x++) {
	 y = y0 + m * (x - x0);
	 g.setColor( Color.BLACK );/*Cor do desenho*/
	 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
	 
	 if(x0==xf) {
		 x=x0;
		 for (y = y0; y <= yf; y++) {
			 g.setColor( Color.BLACK );/*cor do desenho*/
			 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
			  }
	 }
	 
	 	 
	 }
	
}		

public void equacao_diferecial(){
	
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int x, x0, xf, y0, yf,aux;
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
	
	 aux=xf-x0;
	 if(xf==x0){
		 aux=1;
	 }
	 
	 y=y0;
	 m = (yf - y0)/(aux);
	 for (x = x0; x <= xf; x++) {
	 y = y + m ;
	 g.setColor( Color.BLACK );/*cor do desenho*/
	 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
	 }
	 if(x0==xf) {
		 x=x0;
		 for (y = y0; y <= yf; y++) {
			 g.setColor( Color.BLACK );/*cor do desenho*/
			 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
			  }
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
	 if(x0==xf) {
		 x=x0;
		 for (y = y0; y <= yf; y++) {
			 g.setColor( Color.BLACK );/*cor do desenho*/
			 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
			  }
	 }
	 	 
}

public void questao1_4(){
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
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
	 
	 if(x0==xf || y0==yf) {
	 
		 dx=xf-x0;
		 dy=yf-y0;
		 p=(int) (2*(dy-dx));
		 c1=2*dy;
		 c2=2*(dy-dx);
		 y=y0;
		 for (x = x0; x <= xf; x=x+1) {
			 if(p<0) {
				 p=(int) (p+c1);
			 }
			 else {
				 p=(int) (p+c2);
				 y=y+2;
			 }
		 g.setColor( Color.BLACK );/*cor do desenho*/
		 g.drawLine(x, y, x, y);/*desenha o pixel*/
		 
		 if(x0==xf) {
			 x=x0;
			 for (y = y0; y <= yf; y=y+2) {
				 g.setColor( Color.BLACK );/*cor do desenho*/
				 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
				  }
		 }
		 }
	}
	 else {
		 System.out.println("valores invalidos");
	 }	 
}

public void questao1_5(int alt,int larg){
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int x, x0, xf, y0, yf,y;
	 Scanner input = new Scanner(System.in);
	 
	 x0=0;
	 y0=0;
	 xf=alt;
	 yf=larg;
	  	
		 for (y = y0; y <= yf; y+=10) {
			 for(x=x0;x<=xf;x+=1) {
			 g.setColor( Color.BLACK );/*cor do desenho*/
			 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
			 }
			 }
		 for (x = x0; x <= xf; x+=10) {
			 for(y=y0;y<=yf;y+=1) {
			 g.setColor( Color.BLACK );/*cor do desenho*/
			 g.drawLine(x, Math.round(y), x, Math.round(y));/*desenha o pixel*/
			 }
			 }
	 
}



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int opcao;
		System.out.println("digite a largura da sua tela");
		int larg = input.nextInt();
		System.out.println("digite a altura da sua tela");
		int alt =  input.nextInt();
		
		/*inicializa um objeto Desenhar*/
		Desenhar d = new Desenhar(alt,larg);
		d.setAlt(alt);
		d.setLarg(larg);
			
		
		while(true) {
			/*Mostra o menu ao usuário*/
			System.out.printf("[0] LIMPAR TELA \n" + 
			"[1] ALGORITMO RETA: EQUACAO GERAL \n" + 
			"[2] ALGORITMO RETA: EQUACAO DIFERENCIAL \n"
			+ "[3] ALGORITMO RETA: BRESENHAN \n" +
			"[4] 1.4 \n"+ "[5] 1.5 \n"+"[6]sair \n");
			
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
				 d.questao1_4();
			}
			if (opcao == 5) {
				 d.questao1_5(alt,larg);
			}
			if (opcao == 6) {
				 System.exit(0);
			}
		}	
	}
}
