package com.hans.runner.input;

import com.badlogic.gdx.Gdx;
import com.hans.runner.dataobjs.Hans;

public class AccelerometerInputHandler {
	private Hans hans;
	
	public AccelerometerInputHandler(Hans hans) {
		this.hans = hans;
	}
	
	public void handleInput() {
		//Log.i("x:" + Gdx.input.getAccelerometerX());
		System.out.println("y:" + Gdx.input.getAccelerometerY());
		System.out.println("z:" + Gdx.input.getAccelerometerZ());
	}
	
}