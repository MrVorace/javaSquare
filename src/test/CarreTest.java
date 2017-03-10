/**
 * 
 */
package test;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Before;
import org.junit.Test;

import main.Carre;

/**
 * @author vorace
 *
 */
public class CarreTest {
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
	public void testSetPosx() {

		assertEquals(50, this.carre.getPosx());
		this.carre.setPosx(-1);
		assertEquals(0, this.carre.getPosx());
		this.carre.setPosx(200);
		assertEquals(90, this.carre.getPosx());
		this.carre.setPosx(25);
		assertEquals(25, this.carre.getPosx());
	}
	
	@Test
	public void testSetPosy() {

		assertEquals(50, this.carre.getPosy());
		this.carre.setPosy(-1);
		assertEquals(0, this.carre.getPosy());
		this.carre.setPosy(200);
		assertEquals(90, this.carre.getPosy());
		this.carre.setPosy(25);
		assertEquals(25, this.carre.getPosy());
	}
	

}
