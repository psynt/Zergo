package me.monokuma.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import java.util.Iterator;

public class Raindroppes extends Array<Rectangle>{

	private Observer obs = null;
	private PosGal pg = null;

	public void setPg(PosGal pg){
		this.pg = pg;
	}
	public void setObs(Observer obs) {
		this.obs = obs;
	}

	public void spawnRaindrop(){
		Rectangle raindrop = new Rectangle();
		raindrop.x = MathUtils.random(0, 800-64);
		raindrop.y = 480;
		raindrop.width = 64;
		raindrop.height = 64;
		add(raindrop);

    }

    public void update(){

		Iterator<Rectangle> iter = iterator();
		while(iter.hasNext()) {
			Rectangle raindrop = iter.next();
			raindrop.y -= 200 * Gdx.graphics.getDeltaTime();
			if(raindrop.y + 64 < 0) iter.remove();
			if(raindrop.overlaps(pg.getGal())) {
				iter.remove();
				if (obs!=null) obs.update();
			}
		}
	}
}
