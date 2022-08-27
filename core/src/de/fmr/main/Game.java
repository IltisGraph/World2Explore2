package de.fmr.main;

import java.util.Random;

public class Game {
	public Random r = new Random();
	
	public Tree[] createSpawnChunk() {
		
		int a = r.nextInt(16) + 16;
		
		Tree[] out = new Tree[a];
		
		for(int i = 0; i < a; i++) {
			out[i] = new Tree(r.nextInt(600), r.nextInt(600));
		}
		
		return out;
		
	}
}
