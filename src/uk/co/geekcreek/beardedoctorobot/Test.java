package uk.co.geekcreek.beardedoctorobot;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Test extends BasicGame {

	public Test(String gamename) {
		super(gamename);
	}



		@Override
		public void init(GameContainer gc) throws SlickException {
		}

		@Override
		public void update(GameContainer gc, int i) throws SlickException {
		}

		@Override
		public void render(GameContainer gc, Graphics g) throws SlickException {
			g.drawString("Howdy Partner !", 100, 10);
		}

		public static void main(String[] args) throws IOException {
			try {
				//System.out.println(getMainClass());
				//System.setProperty("java.library.path", "./lib");
				//System.setProperty("org.lwjgl.librarypath", new File("./lib/native").getAbsolutePath());
				
				AppGameContainer appgc;
				appgc = new AppGameContainer(new Test("Dave wrote this"));
				appgc.setDisplayMode(640, 480, false);
				appgc.setTargetFrameRate(60);
				appgc.setVSync(true);
				
				appgc.start();
			} catch (SlickException ex) {
				Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
			}
			
		}
		
		
}
