package me.monokuma.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.monokuma.game.Zergo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Zergo";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new Zergo(), config);
	}
}
