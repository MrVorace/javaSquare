package test;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import main.Carre;

public class ControlMouvementTest {

	private Carre carre;

	@Before
	public void init() {
		JFrame fenetre = new JFrame("Carre Rouge");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.carre = new Carre(100, 100);
		fenetre.setContentPane(this.carre);
		fenetre.pack();
		fenetre.setVisible(true);
		this.carre.requestFocus();
	}

	@Test
	public void testKeyPressed() {

		KeyEvent right = new KeyEvent(this.carre, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,
				KeyEvent.VK_RIGHT, 'd');
		this.carre.getKeyListeners()[0].keyPressed(right);
		assertEquals(60, this.carre.getPosx());
		assertEquals(50, this.carre.getPosy());
		KeyEvent left = new KeyEvent(this.carre, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_LEFT,
				'q');

		this.carre.getKeyListeners()[0].keyPressed(left);
		assertEquals(50, this.carre.getPosx());
		assertEquals(50, this.carre.getPosy());
		KeyEvent down = new KeyEvent(this.carre, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_DOWN,
				's');

		this.carre.getKeyListeners()[0].keyPressed(down);
		assertEquals(50, this.carre.getPosx());
		assertEquals(60, this.carre.getPosy());
		KeyEvent up = new KeyEvent(this.carre, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0, KeyEvent.VK_UP,
				'z');

		this.carre.getKeyListeners()[0].keyPressed(up);
		assertEquals(50, this.carre.getPosx());
		assertEquals(50, this.carre.getPosy());

	}

}
