package com.hans.runner.dataobjs;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.TimeUtils;
import com.gushikustudios.rube.loader.serializers.utils.RubeImage;

public class Hans extends Entity {
	private Vector2 accelerationForce;
	private Vector2 jumpForce;
	private boolean aDown;
	private boolean dDown;
	private boolean jump;
	private double jumptime;
	private double MAX_JUMP_TIME = 500;

	public Hans(RubeImage image) {
		super(image);
		accelerationForce = new Vector2(0, 0);
		jumpForce = new Vector2(0, (float) 100000);
	}

	public void update() {
		super.update();
		physicsObject.applyForce(accelerationForce, physicsObject.getPosition(), true);
		
		if(jump)
			if (TimeUtils.millis() - jumptime <= MAX_JUMP_TIME) {
				jump = true;
				physicsObject.applyForce(jumpForce.scl(Gdx.graphics.getDeltaTime()), physicsObject.getPosition(), true);
			}
		else
			jump = false;

	}
	
	public void jump(boolean jump) {
		jumptime = TimeUtils.millis();
		this.jump = jump;
	}
	
	public void setAccelerationForce(Vector2 accelerationForce) {
		this.accelerationForce = accelerationForce;
	}
	
	public void move(double direction) {
		accelerationForce.x += direction;
	}
	

}
