package com.hans.runner;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Hans_Mobile";
		cfg.useGL20 = false;
		cfg.width = 1024;
		cfg.height = 256;
		
		new LwjglApplication(new HansMobile(), cfg);
	}
}
