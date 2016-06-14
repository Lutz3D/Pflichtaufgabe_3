package Datenstrukturen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class VisuellesDiagramm extends StatistischesDiagramm {
	
	private JBalkendiagramm bDiagramm = new JBalkendiagramm(daten);

	public VisuellesDiagramm(Datensatz daten) {
		super(daten);
		ausgabe();
	}
	
	@Override
	public void ausgabe(){
		JFrame visuellesDiagramm = new JFrame("Verkaufszahlen");
		
		JPanel diagrammPanel = new JPanel();
		diagrammPanel.setLayout(new BoxLayout(diagrammPanel, BoxLayout.Y_AXIS));
		
		
		diagrammPanel.add(bDiagramm, BorderLayout.NORTH);
		
		//JPanel dem JFrame hinzuf�gen
		visuellesDiagramm.add(diagrammPanel, BorderLayout.CENTER);
		
	
		
		visuellesDiagramm.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				updateDiagramm();
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				bDiagramm.changeToDatenname();
				updateDiagramm();
				//System.out.println("Mouse is pressed");
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {	
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {	
				
			}
		});
		
		visuellesDiagramm.pack();
		visuellesDiagramm.setVisible(true);
		visuellesDiagramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void updateDiagramm(){
		bDiagramm.repaint();
	}

}
