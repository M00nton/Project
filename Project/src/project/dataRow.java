package project;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class dataRow extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public dataRow() {
		
		this.setBounds(0, 0, 660, 35);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		add(textField_6);
		textField_6.setColumns(10);
	}

}
