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
	 * constructeur permettant de créer un cercle
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
	 * Cette méthode permet d'effectuer une translation d'une conique centree.
	 * @param dx déplacement sur l'axe des abscisses.
	 * @param dy déplacement sur l'axe des ordonnées.
	 */
	public void translation(int dx, int dy){
			super.translation(dx, dy);
			centre.translation(dx, dy);
	}


	
}
