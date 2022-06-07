package gui;

import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import classProject.CreditManagermentSystem;
import classProject.KindCredit;

public class CreditViewer extends JPanel{
	WindowFrame frame;
	CreditManagermentSystem CreditManager;
	
	public CreditViewer(WindowFrame frame, CreditManagermentSystem CreditManager) {
		
		this.frame = frame;
		this.CreditManager = CreditManager;
		
		System.out.println("***"+CreditManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("����");
		model.addColumn("����");
		model.addColumn("�̼�����");
		model.addColumn("����");
		
		for(int i=0; i<CreditManager.size(); i++) {
			Vector row = new Vector();
			KindCredit KC = CreditManager.get(i);
			row.add(KC.getName());
			row.add(KC.getScore());
			row.add(KC.getCredit());
			row.add(KC.getKind());
			model.addRow(row);
		} 
		
		Vector row = new Vector();
		row.add("����,����,��ü���:");
		row.add(CreditManager.average('k'));
		row.add(CreditManager.average('j'));
		row.add(CreditManager.average('a'));
		model.addRow(row);
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
