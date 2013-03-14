import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Cette classe est le point d'entree du programme de visualisation
 * et de manipulation de figures à l'écran.
 * 
 * @author Morgane
 */
public class Dialogue {
	/**
	 * Cette methode crée une fenetre dans laquelle aucune figure
	 * n'apparaît, puis organise un dialogue avec l'utilisateur,
	 * de manière à lui proposer de fabriquer une nouvelle figure
	 * géométrique, d'effectuer une opération sur la figure actuellement
	 * sélectionné, ou de changer de figure sélectionné.
	 * @param args arguments du programme.
	 */
	public static void main(String[] args) {
		JFrame fenetre=new JFrame("Premieres figures");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DessinFigures dessin=new DessinFigures();
		dessin.setPreferredSize(new Dimension(600,600));
		fenetre.setContentPane(dessin);
		fenetre.pack();
		fenetre.setVisible(true);
		Scanner scan;
		scan = new Scanner(System.in);
		int rep, rep2, dx, dy, x, y;
		String rep3;
		while (true) {
			System.out.println("Voulez-vous :");
			System.out.println("   1- fabriquer une figure ?");
			System.out.println("   2- effectuer une operation sur une figure ?");
			rep=scan.nextInt();
			if (rep==1) {
				System.out.println("Voulez-vous construire :");
				System.out.println("   1 - un rectangle ?");
				System.out.println("   2 - un triangle ?");
				System.out.println("   3 - un cercle ?");
				System.out.println("   4 - un quadrilatere ?");
				rep2=scan.nextInt();
				FigureColoree fc = null;
				switch (rep2) {
				case 1:
					fc=new Rectangle();
					break;
				case 2:
					fc=new Triangle();
					break;
				/*case 3:
					fc=new Cercle();
					break;*/
				case 4:
					fc=new Quadrilatere();
					break;
				}
				dessin.ajoute(fc);
			}
			if (rep==2) {
				if (dessin.nbFigures()==0)
					System.out.println("pas de figure actuellement");
				else {
					boolean ok=false;
					while (!ok) {
						System.out.println("Voulez-vous effectuer une operation sur la figure actuellement selectionnee (\"oui\", \"non\")");
						rep3 = scan.next();
						if (rep3.compareTo("oui") == 0) ok=true;
					//	else dessin.selectionProchaineFigure();
					}
					System.out.println("\nVoulez-vous :");
					System.out.println("   1 - translater cette figure ?");
					System.out.println("   2 - changer les points de saisie de cette figure ?");
					System.out.println("   3 - changer la couleur de cette figure ?");
					rep2 = scan.nextInt();
					FigureColoree f=dessin.figureSelection();
					switch (rep2) {
					case 1:
						System.out.println("Entrez le nombre de pixels de translation en largeur :");
						dx=scan.nextInt();
						System.out.println("Entrez le nombre de pixels de translation en hauteur :");
						dy=scan.nextInt();
						f.translation(dx,dy);
						dessin.repaint();
						break;
					case 2:
						Point[] tab=new Point[f.nbPoints()];
						for (int i=0;i<f.nbClics();i++) {
							System.out.print("abscisse point "+i+" = ");
							x=scan.nextInt();
							System.out.print("ordonnee point "+i+" = ");
							y=scan.nextInt();
							tab[i]=new Point(x,y);
						}
						f.modifierPoints(tab);
						dessin.repaint();
						break;
					case 3:
						System.out.println("Quelle couleur ?");
						System.out.println("     1 - rouge ?");
						System.out.println("     2 - vert ?");
						System.out.println("     3 - bleu ?");
						System.out.println("     4 - jaune ?");
						x=scan.nextInt();
						switch (x) {
						case 1 :
							f.changeCouleur(Color.red);
							break;
						case 2 :
							f.changeCouleur(Color.green);
							break;
						case 3 :
							f.changeCouleur(Color.blue);
							break;
						case 4 :
							f.changeCouleur(Color.yellow);
							break;
						}
						dessin.repaint();
					}
				}
			}
		}
	}
}