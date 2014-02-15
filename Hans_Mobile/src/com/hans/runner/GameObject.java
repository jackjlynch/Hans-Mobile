package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;

public class GameObject {
	private int x;
	private int y;
	private Texture sprite;
	private Body physicsObject;
	
	GameObject(int x, int y, Texture sprite, Body physicsObject) {
		this.x = x;
		this.y = y;
		this.sprite = sprite;
		this.physicsObject = physicsObject;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Texture getSprite() {
		return sprite;
	}
	public void setSprite(Texture sprite) {
		this.sprite = sprite;
	}
	public Body getPhysicsObject() {
		return physicsObject;
	}
	public void setPhysicsObject(Body physicsObject) {
		this.physicsObject = physicsObject;
	}
	
	public void update() {
		x = physicsObject.getPosition() //TODO: convert vector to x/y coordinates
	}
	

}
