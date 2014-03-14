package com.hans.runner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class Entity {
	private RubeImage image;
	private Body physicsObject;
	private Sprite sprite;


	Entity(RubeImage image) {
		this.image = image;
		physicsObject = image.body;
		sprite = new Sprite(new Texture(Gdx.files.internal(image.file)));
		sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
		this.update();
	}

	public float getX() {
		return physicsObject.getPosition().x;
	}

	public float getY() {
		return physicsObject.getPosition().y;
	}

	public void draw(SpriteBatch batch) {
		sprite.setRotation(physicsObject.getAngle() / (float) Math.PI * 180);
		sprite.draw(batch);
		
	}

	public void update() {

	}

}
