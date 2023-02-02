package Computação_grafica;

import java.awt.Graphics;
import java.awt.Component;
import java.applet.Applet;
import java.awt.Color; 
import java.awt.Graphics2D; 


import java.util.Scanner;

import javax.swing.JFrame;
public class DDA extends Applet
{
public void paint(Graphics g)
{
double dx,dy,steps,x,y,k;
double xc,yc;
double x1=200,y1=500,x2=600,y2=200;
dx=x2-x1;
dy=y2-y1;
if(Math.abs(dx)>Math.abs(dy))
steps=Math.abs(dx);
else
steps=Math.abs(dy);
xc=(dx/steps);
yc=(dy/steps);
x=x1;
y=y1;
g.fillOval(200,500,5,5);
for(k=1;k<=steps;k++)
{
x=x+xc;
y=y+yc;
g.fillOval((int)x,(int)y,5,5);
}
}

public class Desenhar extends JFrame {

	public Desenhar() {
		setSize(1280,720);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
public static void main(String args[]) {
	
}
}