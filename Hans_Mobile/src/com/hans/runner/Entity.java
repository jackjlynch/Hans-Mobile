package com.hans.runner;

import com.badlogic.gdx.Gdx;
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
		sprite = new Texture(Gdx.files.internal(image.file));
		this.update();
	}

	public float getX() {
		return physicsObject.getPosition().x;
	}

	public float getY() {
		return physicsObject.getPosition().y;
	}

	public void draw(SpriteBatch batch) {
		batch.draw(
				sprite,
				(physicsObject.getPosition().x + image.center.x )
						* GameWorld.METERS_TO_PIXELS,
				(physicsObject.getPosition().y + image.center.y )
						* GameWorld.METERS_TO_PIXELS); /*, image.width / 2
						* GameWorld.METERS_TO_PIXELS, image.height / 2
						* GameWorld.METERS_TO_PIXELS, image.width
						* GameWorld.METERS_TO_PIXELS, image.height
						* GameWorld.METERS_TO_PIXELS, 1, 1,
				physicsObject.getAngle() / (float) Math.PI * 180, 0, 0,
				sprite.getWidth(), sprite.getHeight(), image.flip, false); */
		System.out.println(image.name);
		System.out.println((physicsObject.getPosition().x + image.center.x ) * GameWorld.METERS_TO_PIXELS);
		System.out.println((physicsObject.getPosition().y + image.center.y ) * GameWorld.METERS_TO_PIXELS);
		System.out.println(physicsObject.getPosition().y);
	}

	public void update() {

	}

}
