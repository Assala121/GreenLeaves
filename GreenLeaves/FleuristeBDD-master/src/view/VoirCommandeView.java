package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;

import controller.view.table.VoirCommandeTableTemplate;

public class VoirCommandeView extends JFrame
{
	private JPanel panelwest = new JPanel();
	private JTable table;
	
	public VoirCommandeView(VoirCommandeTableTemplate modele) {
		this.setTitle("Vu de la commande");
	
		table = new JTable(modele);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JTableHeader headt = table.getTableHeader();
		headt.setBackground(new Color(204, 44, 111 ));
		headt.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(197, 230, 229 ));

		JScrollPane pane = new JScrollPane(table);
		
		this.add(pane);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
