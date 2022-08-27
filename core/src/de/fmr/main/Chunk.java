package de.fmr.main;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Chunk {
	
	private Tree[] t;
	private int x, y;
	public SpriteBatch b;
	
	public Chunk(int x, int y, SpriteBatch batch,  Tree[] t) {
		
		this.t = t;
		this.x = x;
		this.y = y;
		b = batch;
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void render(Player Player) {
		
		for(Tree t : this.t) {
			t.setRenderXY(t.getX() - Player.getX(), t.getY() - Player.getY());
			t.render(b);
		}
		
		
		
	}

}