package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import classProject.CreditManagermentSystem;
import gui.CreditViewer;
import gui.WindowFrame;

public class ButtonViewListener implements ActionListener{

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override	
	public void actionPerformed(ActionEvent e) {
		CreditViewer creditViewer = frame.getCreditviewer();
		CreditManagermentSystem Credit_m = getObject("Credit_m.ser");
		creditViewer.setCreditManager(Credit_m);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(creditViewer);
		frame.revalidate();
		frame.repaint();
		}
	public static CreditManagermentSystem getObject(String filename) {
		CreditManagermentSystem Credit_m = null;	
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			Credit_m = (CreditManagermentSystem)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return Credit_m;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return Credit_m;
	}

}
