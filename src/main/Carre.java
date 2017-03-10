package main;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Carre extends JPanel {

	private final static int cote = 10;
	private int PosX;
	private int PosY;

	public Carre(int dimX, int dimY) {

		this.setPreferredSize(new Dimension(dimX, dimY));
		this.PosX = dimX / 2;
		this.PosY = dimY / 2;
		KeyListener kl = new ControlMouvement();
		this.addKeyListener(kl);

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		if (this.getPosx() > this.getWidth() - Carre.cote)
			this.setPosx(this.getWidth() - Carre.cote);
		if (this.getPosy() > this.getHeight() - Carre.cote)
			this.setPosy(this.getHeight() - Carre.cote);
		g.fillRect(this.getPosx(), this.getPosy(), Carre.cote, Carre.cote);

	}

	public int getPosx() {
		return this.PosX;
	}

	public void setPosx(int posx) {
		if (posx >= 0) {
			if (posx > this.getWidth() - 10)
				this.PosX = this.getWidth() - 10;
			else
				this.PosX = posx;

		} else
			this.PosX = 0;
		repaint();
	}

	public int getPosy() {
		return this.PosY;
	}

	public void setPosy(int posy) {
		if (posy >= 0) {
			if (posy > this.getHeight() - 10)
				this.PosY = this.getHeight() - 10;
			else
				this.PosY = posy;

		} else
			this.PosY = 0;
		repaint();

	}

}
