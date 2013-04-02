/**
 * la super classe des figures ayant un centre  
 * @author Morgane
 *
 */
public abstract class ConiqueCentree extends FigureColoree {

	/**
	 * le centre de la figure 
	 */
	protected Point centre;
	
	/**
	 * constructeur permettant de cr�er un cercle
	 */
	public ConiqueCentree(){
		super();
		centre = new Point((int)(Math.random() * 600), (int)(Math.random() * 600));
}
	
	/**
	 * methode de retour d'attribut
	 * @return le centre du cercle
	 */
	public Point rendreCentre() {
    	return this.tab_mem[0];
    }
	
	/**
	 * Cette m�thode permet d'effectuer une translation d'une conique centree.
	 * @param dx d�placement sur l'axe des abscisses.
	 * @param dy d�placement sur l'axe des ordonn�es.
	 */
	public void translation(int dx, int dy){
			super.translation(dx, dy);
			centre.translation(dx, dy);
	}


	
}
