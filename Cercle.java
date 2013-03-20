import java.awt.*;

public class Cercle extends ConiqueCentree{
	
	private double rayon;
	
	public Cercle(){
		super();
		rayon = Math.random() * 100 ;
		tab_mem[0] = new Point(centre.rendreX() - (int)(rayon), centre.rendreY());
		tab_mem[1] = new Point(centre.rendreX() + (int)(rayon), centre.rendreY());
	}
	
	public double rendreRayon(){
		return rayon;
	}
	
	public int nbPoints() {
		return 2;
	}


	public int nbClics() {
		return 2;
	}


	public void affiche(Graphics g){
		g.setColor(Color.black);
		g.fillOval(centre.rendreX() - (int)(rayon), centre.rendreY() - (int)(rayon), (int)(rayon * 2), (int)(rayon * 2));
		super.affiche(g);
	}
	
	public void modifierPoints(Point[] ps) {
		
	}
	

}
