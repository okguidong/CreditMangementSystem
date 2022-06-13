package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import classProject.CreditManagermentSystem;
import listener.CreditAdderCancelListener;
import listener.CreditAdderListener;

public class CreditAdder extends JPanel {

	CreditManagermentSystem CreditManager;
	WindowFrame frame;
	
	public CreditAdder(WindowFrame frame,CreditManagermentSystem CreditManager) {
		
		this.frame = frame;
		this.CreditManager = CreditManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("이름 : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelScore = new JLabel("점수 : ", JLabel.TRAILING);
		JTextField fieldScore = new JTextField(10);
		labelScore.setLabelFor(fieldScore);
		panel.add(labelScore);
		panel.add(fieldScore);
		
		JLabel labelCredit = new JLabel("이수학점 : ", JLabel.TRAILING);
		JTextField fieldCredit = new JTextField(10);
		labelCredit.setLabelFor(fieldCredit);
		panel.add(labelCredit);
		panel.add(fieldCredit);
		
		JLabel labelKind = new JLabel("종류 : ", JLabel.TRAILING);
		JTextField fieldKind = new JTextField(10);
		labelKind.setLabelFor(fieldKind);
		
		JButton saveButton =new JButton("save");
		saveButton.addActionListener(new CreditAdderListener(fieldName,fieldScore,
				fieldCredit,fieldKind,CreditManager));
		
		JButton cancelButton =new JButton("cancel");
		cancelButton.addActionListener(new CreditAdderCancelListener(frame));
		
		panel.add(labelKind);
		panel.add(fieldKind);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);

	}
}
