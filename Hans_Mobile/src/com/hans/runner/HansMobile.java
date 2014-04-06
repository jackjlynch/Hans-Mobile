package com.hans.runner;

import java.util.concurrent.TimeUnit;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.gushikustudios.rube.RubeScene;
import com.gushikustudios.rube.loader.RubeSceneLoader;
import com.hans.runner.input.HansInputHandler;

public class HansMobile implements ApplicationListener {
	private OrthographicCamera camera;
	private OrthographicCamera debugCamera;
	private SpriteBatch batch;
	private World world;
	private GameWorld gameWorld;
	Box2DDebugRenderer debugRenderer; 
	
	@Override
	public void create() {
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		RubeSceneLoader loader = new RubeSceneLoader();
	    RubeScene scene = loader.loadScene(Gdx.files.internal("maps/trustfall.json"));
	    gameWorld = new GameWorld(scene);
	    
	    camera = new OrthographicCamera(w, h);
	    camera.position.set(w / 2, h / 2, 0);
	    camera.update();
	    
	    w /= GameWorld.METERS_TO_PIXELS;
	    h /= GameWorld.METERS_TO_PIXELS;
		debugCamera = new OrthographicCamera(w, h);
		debugCamera.position.set(w / 2, h / 2, 0f);
		debugCamera.update();
		debugRenderer = new Box2DDebugRenderer();

		batch = new SpriteBatch();
		world = scene.getWorld();
		
		Gdx.input.setInputProcessor(new HansInputHandler(gameWorld.getHans()));

	}

	@Override
	public void dispose() {
		batch.dispose();

	}

	@Override
	public void render() {		
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		gameWorld.update();
		gameWorld.draw(batch);
		
		debugRenderer.render(world, debugCamera.combined);

		
		world.step(Gdx.graphics.getDeltaTime(), 12, 4); //update physics world

	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
