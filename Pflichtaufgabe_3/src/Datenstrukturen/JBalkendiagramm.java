package Datenstrukturen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Datenstrukturen.Dateneintrag;

public class JBalkendiagramm extends JPanel{

	private Datensatz daten;
	boolean isChangeToDatenname = false;
	
	//Font
	private Font font = new Font("Serif", Font.BOLD, 24);
	
	public JBalkendiagramm(Datensatz daten) {
		this.daten = daten;
		setPreferredSize(new Dimension(600, 200));

	} 
	
	@Override
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		Point balkenPosition = new Point(0,0);
		double balkenBreite = 0;
		double pixelValue = (600-90)/(double)daten.getDateneintrag(daten.getMax()).getDatenwert();
		
		

			for(int i = 0; i<daten.size(); i++){

				balkenPosition.setLocation(10, 10+i*25);
				balkenBreite = pixelValue * daten.getDateneintrag(i).getDatenwert();
				
				g.setFont(font);
				g.drawRect(balkenPosition.x, balkenPosition.y, (int)balkenBreite, 20);
				g.drawString(daten.getDateneintrag(i).getDatenname(), 15, balkenPosition.y+18);

				
				
                				
				if(isChangeToDatenname==true){
					g.drawString(daten.getDateneintrag(i).getDatenname(), (int)balkenBreite+20, balkenPosition.y+18);
				}
				else {
					g.drawString(daten.getDateneintrag(i).getDatenwert()+"", (int)balkenBreite+20, balkenPosition.y+18);
				}
				

				
			}
			isChangeToDatenname = false;
				
			
	}
	public void redLine () {
		JSeparator x = new JSeparator(SwingConstants.VERTICAL);
		x.setPreferredSize(new Dimension(100,50));
		x.setBackground(Color.red);
	}
	
	public void changeToDatenname(){
		isChangeToDatenname = true;
	}
	

		
	
}
