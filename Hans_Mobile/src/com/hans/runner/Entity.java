package com.hans.runner;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.physics.box2d.Body;

public class Entity {
	private int x;
	private int y;
	private Texture sprite;
	private Body physicsObject;
	
	Entity(Texture sprite, Body physicsObject) {
		this.sprite = sprite;
		this.physicsObject = physicsObject;
		this.update();
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
		x = (int) physicsObject.getPosition().x; //update sprite's position to match physics position
		y = (int) physicsObject.getPosition().y;
	}
	

}
