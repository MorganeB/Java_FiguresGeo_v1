import java.awt.*;


/**
 * Classe "Quadrilatere". Permet de faire des rectangles
 * et des quadrilatères quelconques 
 * @author Morgane
 *
 */
public class Quadrilatere  extends Polygone{
	
	
	/**
	 * Ce constructeur instancie un quadrilatère avec 
	 * des sommets aléatoires (via le constructeur de Polygone).
	 */
	public Quadrilatere(){
		super();
	}
	
	/**
	 * Cette méthode retourne en résultat le nombre de points de mémorisation d'un quadrilatère.
	 */
	public int nbPoints(){
		return 4;
	}

}
