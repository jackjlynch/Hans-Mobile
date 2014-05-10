package com.hans.runner.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector2;
import com.hans.runner.dataobjs.Hans;

public class HansInputHandler implements InputProcessor {
	private Hans hans;
	
	public HansInputHandler(Hans hans) {
		this.hans = hans;
	}

	@Override
	public boolean keyDown(int keycode) {
		switch(keycode) {
		case Input.Keys.W:
			hans.startJump(true);
			return true;
		case Input.Keys.A:
			hans.move(-0.1);
			return true;
		case Input.Keys.D:
			hans.move(0.1);
			return true;
	}
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
		case Input.Keys.W:
			hans.startJump(false);
			return true;
		}
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
