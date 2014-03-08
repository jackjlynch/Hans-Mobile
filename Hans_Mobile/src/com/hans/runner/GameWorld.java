package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.utils.ObjectMap;
import com.gushikustudios.rube.RubeScene;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class GameWorld {
	private ObjectMap<String, Entity> entities;
	private RubeScene scene;
	
	GameWorld(RubeScene scene) {
		this.scene = scene;
		entities = new ObjectMap<String, Entity>();
		for(RubeImage r : scene.getImages()) {
			entities.put(r.name, new Entity(r));
		}
	}
	
	public void update() {

	}
	
	public void createEntity(Texture sprite, Body physicsObject) {
	}
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		for(Entity e : entities.values()) { //draw sprites
			e.draw(batch);
		}
		batch.end();
	}

}
