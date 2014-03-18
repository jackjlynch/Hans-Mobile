package com.hans.runner;

import com.badlogic.gdx.math.Vector2;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class Hans extends Entity {
	private Vector2 accelerationForce;

	Hans(RubeImage image) {
		super(image);
		accelerationForce = new Vector2(0, 0);
	}

	public void update() {
		super.update();
		accelerationForce.x += 0.005;
		physicsObject.applyForce(accelerationForce, physicsObject.getPosition(), true);
	}
	

}
