package main;
import java.awt.event.*;

public class ControlMouvement implements KeyListener {

	public void keyPressed(KeyEvent e) {

		int cx = ((Carre) e.getSource()).getPosx();
		int cy = ((Carre) e.getSource()).getPosy();

		int c = e.getKeyChar();
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			((Carre) e.getSource()).setPosx(cx + 10);

		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			((Carre) e.getSource()).setPosy(cy - 10);
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			((Carre) e.getSource()).setPosy(cy + 10);
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			((Carre) e.getSource()).setPosx(cx - 10);
		}
		if (c == 'z') {
			((Carre) e.getSource()).setPosy(cy - 10);
		}
		if (c == 'q') {
			((Carre) e.getSource()).setPosx(cx - 10);
		}
		if (c == 's') {
			((Carre) e.getSource()).setPosy(cy + 10);
		}
		if (c == 'd') {
			((Carre) e.getSource()).setPosx(cx + 10);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
