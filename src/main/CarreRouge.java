package main;
import javax.swing.JFrame;

public class CarreRouge {
	public static void main(String[] args) {

		JFrame fenetre = new JFrame("Carre Rouge");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Carre dessin = new Carre(300, 300);
		fenetre.setContentPane(dessin);
		fenetre.pack();
		fenetre.setVisible(true);
		dessin.requestFocus();

	}
}
