package Datenstrukturen;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JDatensatzEditor extends JFrame{

	private Datensatz daten;
	private VisuellesDiagramm visuell;
	
	public JDatensatzEditor(Datensatz daten, VisuellesDiagramm visuell){
		super("Verkaufszahlen");
		this.daten = daten;
		this.visuell = visuell;
		buildGUI();
	}
	
	//ArrayListen
	private ArrayList<JTextField> datenJTextField = new ArrayList<JTextField>();
	private ArrayList<JLabel> datenJLabel = new ArrayList<JLabel>();
	
	//Font
	private Font font = new Font("Serif", Font.BOLD, 24);
	
	//Panels
	private JPanel datenPanel = new JPanel();
	
	//Index f�r n�chstes neues Element
	private int index = 0;
	
	private void buildGUI(){
		//Button
		JButton btnNew = new JButton("Neuer Eintrag");
		btnNew.setFont(font);
		add(btnNew, BorderLayout.SOUTH);
		
		//Panel-Layout
		datenPanel.setLayout(new GridLayout(daten.getAnzahlDateneintraege(), 2));


		for(int i = 0; i<daten.getAnzahlDateneintraege(); i++){
			//buildDatenFeld(i);
			
			datenJLabel.add(new JLabel(daten.getDateneintrag(i).getDatenname()));
			datenJTextField.add(new JTextField(daten.getDateneintrag(i).getDatenwert()+""));
			
			datenJLabel.get(i).setFont(font);
			datenJTextField.get(i).setFont(font);
			
			datenPanel.add(datenJLabel.get(i));
			datenPanel.add(datenJTextField.get(i));
			
			datenJTextField.get(i).addKeyListener(new keyListener(i));			
		}
		
		
		//Listerner
		btnNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//
				int index = datenJTextField.size();
				
				datenJTextField.add(new JTextField("0"));
				datenJLabel.add(new JLabel("Unbenannt"));
				
				datenJLabel.get(index).setFont(font);
				datenJTextField.get(index).setFont(font);
				
				datenPanel.add(datenJLabel.get(index));
				datenPanel.add(datenJTextField.get(index));
				
				//Daten dem Dantensatz hinzuf�gen:
				daten.add(new Dateneintrag("Unbenannt", 0));
				
				//datenPanel Layout aktualisieren:
				datenPanel.setLayout(new GridLayout(daten.getAnzahlDateneintraege(), 2));
				
				datenJTextField.get(index).addKeyListener(new keyListener(index));

				ausgabe();
				visuell.updateDiagramm();
				pack();
				
			}
		});
		
		add(datenPanel, BorderLayout.CENTER);

		
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	//Hilfsmethode
	public void ausgabe(){
		System.out.println(daten.titel);
		for(int i=0; i < daten.getAnzahlDateneintraege(); i++){
			System.out.println(daten.getDateneintrag(i).getDatenname()+": "+
			daten.getDateneintrag(i).getDatenwert()+" "+
			daten.dateneinheit+" ("+daten.getDateneintrag(i).relativerAnteilVon(daten.getGesamtwert())+"%)");
		}
		System.out.println("\nGesamtwert: "+ daten.getGesamtwert()+" (100%)");
	}
	
	//Innere Klasse f�r den KeyListerner:
	public class keyListener implements KeyListener{
		
		private int index;
		public keyListener(int index){
			this.index=index;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (datenJTextField.get(index).getText().equals("")) {
				daten.getDateneintrag(index).setDatenwert(0);
			}
			else {			
			
			daten.getDateneintrag(index).setDatenwert(Integer.parseInt(datenJTextField.get(index).getText()));
			visuell.updateDiagramm();
			
			}
			visuell.updateDiagramm();
			ausgabe();
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
	}
}
