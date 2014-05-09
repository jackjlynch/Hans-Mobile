package com.hans.runner.dataobjs;

import com.badlogic.gdx.math.Vector2;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class Hans extends Entity {
	private Vector2 accelerationForce;
	private Vector2 jumpForce;
	private boolean aDown;
	private boolean dDown;
	private

	Hans(RubeImage image) {
		super(image);
		accelerationForce = new Vector2(0, 0);
		jumpForce = new Vector2(0, (float) 1000);
	}

	public void update() {
		super.update();
		physicsObject.applyForce(accelerationForce, physicsObject.getPosition(), true);
	}
	
	public void jump() {
		physicsObject.applyForce(jumpForce, physicsObject.getPosition(), true);
	}
	
	public void setAccelerationForce(Vector2 accelerationForce) {
		this.accelerationForce = accelerationForce;
	}
	
	public void move(double direction) {
		accelerationForce.x += direction;
	}
	

}
