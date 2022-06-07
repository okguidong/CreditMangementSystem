package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import classProject.CreditManagermentSystem;

public class WindowFrame extends JFrame {
	
	CreditManagermentSystem CreditManager;
	
	MenuSelection menuselection;
	CreditAdder creditadder;
	CreditViewer creditviewer;

	public WindowFrame(CreditManagermentSystem CreditManager) {		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.CreditManager = CreditManager;
		menuselection = new MenuSelection(this);
		creditadder = new CreditAdder(this);
		creditviewer = new CreditViewer(this, this.CreditManager);
		
		this.setUpPanel(menuselection);
		
		this.setVisible(true); 
	}
	
	public void setUpPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public CreditAdder getCreditadder() {
		return creditadder;
	}

	public void setStudentadder(CreditAdder creditadder) {
		this.creditadder = creditadder;
	}

	public CreditViewer getCreditviewer() {
		return creditviewer;
	}

	public void setCreditviewer(CreditViewer creditviewer) {
		this.creditviewer = creditviewer;
	}


}
