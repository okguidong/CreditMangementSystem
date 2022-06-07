package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CreditAdder extends JPanel {

	WindowFrame frame;
	
	public CreditAdder(WindowFrame frame) {
		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelSubject = new JLabel("�̸� : ", JLabel.TRAILING);
		JTextField fieldSubject = new JTextField(10);
		labelSubject.setLabelFor(fieldSubject);
		panel.add(labelSubject);
		panel.add(fieldSubject);
		
		JLabel labelName = new JLabel("���� : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPhone = new JLabel("�̼����� : ", JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelName.setLabelFor(fieldPhone);
		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		JLabel labelGoal = new JLabel("���� : ", JLabel.TRAILING);
		JTextField fieldGoal = new JTextField(10);
		labelName.setLabelFor(fieldGoal);
		panel.add(labelGoal);
		panel.add(fieldGoal);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}