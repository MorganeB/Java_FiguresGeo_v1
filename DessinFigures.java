import java.awt.*;
import javax.swing.*;

/**
 * Chaque instance de cette classe est un dessin 
 * comportant plusieurs figures color�es visualisables � l'�cran dont une seule est s�lectionn�e.
 * @author Morgane
 *
 */

public class DessinFigures extends JPanel{

	/**
	 *  Nombre effectif de figures apparaissant dans ce dessin.
	 */
	private int nbf;
	
	/**
	 * Indice de la figure actuellement s�lectionn�e (-1 si aucune figure n'est s�lectionn�e).
	 */
	private int sel;
	
	/**
	 * Tableau pouvant contenir jusqu'� 100 figures � visualiser et manipuler
	 */
	private FigureColoree[] figures;
	
	
	/**
	 * Constructeur vide : dessin ne contenant aucune figure
	 */
	public DessinFigures(){
		figures = new FigureColoree[100]; 
		nbf = 0;
		sel = -1 ;
	}
	
	/**
	 *  Cette m�thode permet d'ajouter une nouvelle figure au dessin.
	 * @param fc une nouvelle figure passee en parametre
	 */
	public void ajoute(FigureColoree fc){
		if(fc != null){
		// on met la figure dans le tableau = operation d'ajout
			figures[nbf] = fc;
			if(sel != -1) 
				figures[sel].deSelectionne();
				sel = nbf;
				fc.selectionne();
				nbf ++;
			}
		//provoque l'execution de paintComponent
		repaint();
	}
	

	/**
	 * Cette m�thode redessine toutes les figures du dessin.
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 0; i < nbf; i++)
			figures[i].affiche(g);
	}
	
	/**
	 *  Cette m�thode retourne la figure actuellement s�lectionn�e.
	 * @return figure s�lectionn�e (ou null) si aucune figure n'est s�lectionn�e.
	 */
	public FigureColoree figureSelection(){
		if(sel != -1)
			return figures[sel];
		else
			return null;
	}
	public int nbFigures(){
		return nbf;
	}
	
	
	/**
	 * Cette m�thode retourne la figure actuellement s�lectionn�e
	 * @param g environnement graphique de dessin
	 */
	/*
	public void selectionProchaineFigure(){
	if(sel != -1){
		figures[sel].deSelectionne();
		sel ++;
			if(sel == nbf)
			
	}*/ 
	
	
	
}
