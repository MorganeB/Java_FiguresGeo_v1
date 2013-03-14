/**
 * classe Rectangle 
 * @author Morgane
 *
 */
public class Rectangle extends Quadrilatere{

	/**
	 *  Ce constructeur instancie un rectangle de position al�atoire
	 */
	public Rectangle(){
		super();
		tab_mem = new Point[4];
    	tab_mem[0] = new Point((int)(Math.random()*400),(int)(Math.random()*400));
    	tab_mem[2] = new Point((int)(Math.random()*400),(int)(Math.random()*400));
    	tab_mem[1] = new Point(tab_mem[0].rendreX(), tab_mem[2].rendreY());
    	tab_mem[3] = new Point(tab_mem[2].rendreX(), tab_mem[0].rendreY());
    }
	
	/**
	 * Cette m�thode retourne en r�sultat le nombre de points 
	 * dont on a besoin pour la saisie d'un rectangle.
	 */
	public int nbClics(){
		return 2;
	}
	
	/**
	 * Cette m�thode modifie le rectangle conform�ment 
	 * � un ensemble de deux points de saisie.
	 */
	public int nbPoints(){
		return 2;
	}



}
