package pong;

import java.awt.Color;

import java.awt.Graphics;


public class Score {
	public static int pontoInimigo = 0;
	public static int pontoMeu = 0;
	public static Ball ball;
	
	public Score() {
		
	}
	
	public void tick(double x, double y) {
		//System.out.println("Ponto do meu " + y);
		if(y >= Game.HEIGHT) {
			//Ponto do inimigo
			pontoInimigo = pontoInimigo + 1;			
			new Game();
			return;
		} else if (y == 0) {
			//Ponto do jogador
			pontoMeu = pontoMeu + 1;			
			new Game();
			return;
		}
	
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawString(pontoMeu + " X " + pontoInimigo, 10, 60);
		
	}
}
