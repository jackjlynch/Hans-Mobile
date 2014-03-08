package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class Entity {
	private RubeImage image;
	private Body physicsObject;
	private Texture sprite;
	
	Entity(RubeImage image) {
		this.image = image;
		physicsObject = image.body;
		sprite = new Texture(image.file);
		this.update();
	}
	

	
	public float getX() {
		return physicsObject.getPosition().x;
	}

	public float getY() {
		return physicsObject.getPosition().y;
	}

	public void draw(SpriteBatch batch) {
		batch.draw(sprite, physicsObject.getPosition().x, physicsObject.getPosition().y, image.center.x, image.center.y, image.width, image.height, image.scale, image.scale, image.angleInRads, 0, 0, (int) image.width, (int) image.height, image.flip, image.flip);
	}
	
	public void update() {

	}
	

}
