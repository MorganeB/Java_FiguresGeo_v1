/** 
 * Classe permettant de faire des carr�s
 * @author Morgane
 *
 */
public class Carre extends Quadrilatere {
	
	/**
	 * constructeur permettant de g�n�rer un carr�
	 */
	public Carre(){
		tab_mem[0] = new Point((int)(Math.random()*600),(int)(Math.random()*600));
		tab_mem[1] = new Point((int)(Math.random()*600),(int)(Math.random()*600));
		tab_mem[2]= new Point(tab_mem[1].rendreY()-tab_mem[0].rendreY()+tab_mem[1].rendreX(),(tab_mem[0].rendreX())-tab_mem[1].rendreX()+tab_mem[1].rendreY());
		tab_mem[3]= new Point(tab_mem[1].rendreY()-tab_mem[0].rendreY()+tab_mem[0].rendreX(),(tab_mem[0].rendreX())-tab_mem[1].rendreX()+tab_mem[0].rendreY());
	}
	
	/**
	 * Cette m�thode modifie le carr� conform�ment � un ensemble 
	 * de points de saisie (ses nouveaux sommets).
	 */
	public void modifierPoints(Point[] tab_saisie){
		tab_mem[0] = tab_saisie[0];
		tab_mem[1] = tab_saisie[1];
		tab_mem[2] = new Point(tab_mem[1].rendreY()-tab_mem[0].rendreY()+tab_mem[1].rendreX(),(tab_mem[0].rendreX())-tab_mem[1].rendreX()+tab_mem[1].rendreY());
		tab_mem[3] = new Point(tab_mem[1].rendreY()-tab_mem[0].rendreY()+tab_mem[0].rendreX(),(tab_mem[0].rendreX())-tab_mem[1].rendreX()+tab_mem[0].rendreY());
	}

	/**
	 * Cette m�thode retourne en r�sultat le nombre de points 
	 * dont on a besoin pour la saisie d'un carr�.
	 */
	public int nbClics(){
		return 2;
	}
}
