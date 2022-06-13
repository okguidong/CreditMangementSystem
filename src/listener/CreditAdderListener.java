package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JTextField;

import classProject.CreditManagermentSystem;
import classProject.KindCredit;
import gui.CreditAdder;
import gui.WindowFrame;

public class CreditAdderListener implements ActionListener{

	JTextField fieldName;
	JTextField fieldScore;
	JTextField fieldCredit;
	JTextField fieldKind;
	CreditManagermentSystem CreditManager;	
	

	public CreditAdderListener(
			JTextField fieldName, 
			JTextField fieldScore, 
			JTextField fieldCredit,
			JTextField fieldKind,
			CreditManagermentSystem CreditManager) 
	{
		this.fieldName = fieldName;
		this.fieldScore = fieldScore;
		this.fieldCredit = fieldCredit;
		this.fieldKind = fieldKind;
		this.CreditManager = CreditManager;
	}
	
	public void actionPerformed(ActionEvent e) {
		
//		CreditManagermentSystem CreditManagermentSystem = new CreditManagermentSystem();
//		CreditManagermentSystem.add(fieldName.getText(), Float.parseFloat(fieldScore.getText()), Integer.parseInt(fieldCredit.getText()),fieldKind.getText());
//		
		
		KindCredit KindCredit = new KindCredit();
		
		KindCredit.setName(fieldName.getText());
		KindCredit.setScore(Float.parseFloat(fieldScore.getText()));
		KindCredit.setCredit(Integer.parseInt(fieldCredit.getText()));
		KindCredit.setKind(fieldKind.getText());
		KindCredit.printInfo();
		CreditManager.KClist.add(KindCredit); 
		putObject(CreditManager, "Credit_m.ser");
	}
	
	public static void putObject(CreditManagermentSystem Credit_m, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(Credit_m);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
