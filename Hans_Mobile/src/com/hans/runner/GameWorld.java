package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.utils.Array;
import com.gushikustudios.rube.RubeScene;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class GameWorld {
	private Array<Entity> entities;
	private RubeScene scene;
	public static final int METERS_TO_PIXELS = 40;
	
	GameWorld(RubeScene scene) {
		this.scene = scene;
		entities = new Array<Entity>();
		
		if(scene.getImages() !=  null)
			for(RubeImage r : scene.getImages()) {
				r.file = r.file.substring(r.file.indexOf("images"));
				entities.add(new Entity(r));
			}
	}
	
	public void update() {

	}
	
	public void createEntity(Texture sprite, Body physicsObject) {
	}
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		for(Entity e : entities) { //draw sprites
			e.draw(batch);
		}
		batch.end();
	}

}
