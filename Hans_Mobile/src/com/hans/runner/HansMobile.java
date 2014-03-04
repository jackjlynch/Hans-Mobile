package com.hans.runner;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.gushikustudios.rube.RubeScene;
import com.gushikustudios.rube.loader.RubeSceneLoader;

public class HansMobile implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	private World world;
	private GameWorld test;
	Box2DDebugRenderer debugRenderer; 
	
	@Override
	public void create() {
		test = new GameWorld();
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		RubeSceneLoader loader = new RubeSceneLoader();
	    RubeScene scene = loader.loadScene(Gdx.files.internal("maps/hanswithbody.json"));
		
		camera = new OrthographicCamera(w * 0.005f, h * 0.005f);
		camera.position.set(0f, 0f, 0f);
		camera.update();
		debugRenderer = new Box2DDebugRenderer();
		batch = new SpriteBatch();
		world = scene.getWorld();




	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();

	}

	@Override
	public void render() {		
		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		debugRenderer.render(world, camera.combined);

		
/*		batch.setProjectionMatrix(camera.combined);
		test.draw(batch);
		
		
		camera.update();
*/
		world.step(Gdx.graphics.getDeltaTime(), 12, 4); //update physics world
		test.update();

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
