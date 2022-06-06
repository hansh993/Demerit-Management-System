package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.PersonManager;
import person.PersonInput;

public class DemeritViewer extends JPanel {
	WindowFrame frame;
	PersonManager personmanager;
	
	public DemeritViewer(WindowFrame frame, PersonManager personmanager) {
		this.frame=frame;
		this.personmanager = personmanager;
		
		System.out.println("***"+ personmanager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Demerit");
		model.addColumn("Contact Info.");
		
		for(int i=0; i<personmanager.size(); i++) {
			Vector row = new Vector();
			PersonInput pi = personmanager.get(i);
			row.add(pi.getId());
			row.add(pi.getName());
			row.add(pi.getDemerit());
			row.add(pi.getEmail());
			row.add(pi.getP_no());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
