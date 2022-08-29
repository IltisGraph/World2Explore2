package de.fmr.main;

import java.util.Random;

public class Game {
	public Random r = new Random();
	
	public Tree[] createSpawnChunk() {
		
		int a = r.nextInt(16) + 16;
		
		int lastY = 600;
		
		int stepY = 600 / a;
		
		int newY;
		
		Tree[] out = new Tree[a];
		
		for(int i = 0; i < a; i++) {
			newY = lastY - stepY;
			lastY = newY;
			
			out[i] = new Tree(r.nextInt(600), newY);
			
		}
		
		return out;
		
	}
	
	public Tree[] createChunk(int x, int y) {
		
		int a = r.nextInt(16) + 16;
		
		int lastY = y;
		
		int stepY = 600 / a;
		
		int newY;
		
		Tree[] out = new Tree[a];
		
		for(int i = 0; i < a; i++) {
			newY = lastY - stepY;
			lastY = newY;
			
			out[i] = new Tree(r.nextInt(600) + x, newY);
		}
		
		return out;
	}
	
	static boolean checkIfCollidesTree(int x, int y, int ex, int ey) {
		return x > ex && x < ex + 38 && y > ey && y < ey + 60;
	}
	
	
}
