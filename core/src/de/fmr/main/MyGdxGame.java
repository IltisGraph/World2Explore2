package de.fmr.main;



import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer sp;
	Player Player;
	Tree t;
	Chunk chunk;
	Game g;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		sp = new ShapeRenderer();
		Player = new Player(250 - 32, 250 - 32);
		
		g = new Game();
		
		t = new Tree(200, 200);
		chunk = new Chunk(0, 600, batch, g.createSpawnChunk());
			
		
	}

	@Override
	public void render () {
		update();
		ScreenUtils.clear(1, 1, 1, 1);
		
		//draw background
		sp.begin(ShapeRenderer.ShapeType.Filled);
		sp.setColor(Color.GREEN);
		sp.rect(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		sp.end();
		
		
		//Trees
		
		t.render(batch);
		
		//Chunk
		chunk.render(Player);
		
		
		
		//Player
		Player.render(batch);
		
		
		
	}
	
	@Override
	public void dispose () {
		sp.dispose();
		batch.dispose();
	}
	
	public void update() {
		t.setRenderXY(t.getX() - Player.getX(), t.getY() - Player.getY());
		
		Player.actualize();
		//System.out.println(Player.getX() + Player.getY());
		
		
	}
}
