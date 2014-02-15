package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.utils.Array;

public class GameWorld {
	private Array<Entity> entities;
	
	GameWorld() {
		entities = new Array<Entity>();
	}
	
	public void update() {
		for(Entity e : entities) {
			e.update();
		}
	}
	
	public void createEntity(int x, int y, Texture sprite, Body physicsObject) {
		entities.add(new Entity(x, y, sprite, physicsObject));
	}
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		for(Entity e : entities) {
		batch.draw(e.getSprite(), e.getX(), e.getY());
		}
		batch.end();
	}

}
