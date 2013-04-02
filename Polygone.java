import java.awt.*;

/**
 * Cette classe abstraite est la super classe de tous les polygones.
 * @author Morgane
 *
 */
public class Polygone extends FigureColoree{

	/**
	 * Constructeur vide : fabrique un polygone aux sommets aléatoires.
	 */
	public Polygone(){
		super();
		for(int i = 0; i < tab_mem.length; i++){
			tab_mem[i] = new Point((int)(Math.random()*600), (int)(Math.random() * 600));
		}
	}
	
	
	/**
	 * Méthode affichant un polygone (fait appel à drawPolygon de la classe Java Polygon).
	 * @param g - contexte graphique.
	 */
	public void affiche(Graphics g){
		Polygon p = new Polygon();
			for(int i = 0; i < tab_mem.length; i++){
				p.addPoint(tab_mem[i].rendreX(), tab_mem[i].rendreY());
			}
			g.setColor(this.getCouleur());
			g.fillPolygon(p);
			super.affiche(g);
	}
	
	

	/**
	 * Cette méthode retourne en résultat le nombre de points dont on a besoin, en général, pour la saisie d'un polygone.
	 */
	public int nbClics(){
		return 4;
	}
	
	/**
	 * Cette méthode retourne en résultat le nombre de points de mémorisation (en général) d'un polygone.
	 */
	public int nbPoints(){
		return 4;
	}
	
	/**
	 * Cette méthode modifie le polygone conformément à un ensemble 
	 * de points de saisie (ses nouveaux sommets).
	 */
	 public void modifierPoints(Point[] tab_saisie){
		 if(tab_saisie!=null){
			 for(int i = 0; i < tab_mem.length; i++)
				 this.tab_mem = tab_saisie;
		 }
	 }
}
