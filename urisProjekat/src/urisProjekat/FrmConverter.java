package urisProjekat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class FrmConverter extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textFieldInput;
	private JTextField textBin;
	private JTextField textDec;
	private JTextField textHex;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConverter frame = new FrmConverter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmConverter() {
		setForeground(new Color(235, 242, 236));
		setBackground(new Color(199, 215, 227));
		setFont(new Font("Times New Roman", Font.BOLD, 13));
		setTitle("Smart Converter");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		String[] vrednosti = {"Binary", "Hexadecimal", "Decimal"};
		JComboBox comboBox = new JComboBox(vrednosti);
		comboBox.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridwidth = 13;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel = new JLabel("Enter number for conversion: ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textFieldInput = new JTextField();
		textFieldInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(comboBox.getSelectedItem()=="Decimal") {
						try {
							int decimal = Integer.parseInt(textFieldInput.getText());
							String binary = Integer.toBinaryString(decimal);
							String hexadecimal = Integer.toHexString(decimal);
							textBin.setText(binary);
							textDec.setText(textFieldInput.getText());
							textHex.setText(hexadecimal);
							
						}catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, 
									"Morate uneti decimalni broj", "Los unos", JOptionPane.WARNING_MESSAGE);
						}
					}else if(comboBox.getSelectedItem()=="Binary") {
						try {
							int decimal = Integer.parseInt(textFieldInput.getText(), 2);
							String binary = textFieldInput.getText();
							String hexadecimal = Integer.toHexString(decimal);
							textBin.setText(binary);
							textDec.setText("" + decimal);
							textHex.setText(hexadecimal);
						}
						catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, 
									"Morate uneti binarni broj", "Los unos", JOptionPane.WARNING_MESSAGE);
						}
					}
					else if(comboBox.getSelectedItem()=="Hexadecimal") {
						try {
							int decimal = Integer.parseInt(textFieldInput.getText(), 16);
							String binary = Integer.toBinaryString(decimal);
							String hexadecimal = textFieldInput.getText();
							textBin.setText(binary);
							textDec.setText("" + decimal);
							textHex.setText(hexadecimal);
						}
						catch (NumberFormatException e2) {
							JOptionPane.showMessageDialog(null, 
									"Morate uneti heksadecimalni broj", "Los unos", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				
			}
		});
		GridBagConstraints gbc_textFieldInput = new GridBagConstraints();
		gbc_textFieldInput.gridwidth = 5;
		gbc_textFieldInput.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldInput.gridx = 3;
		gbc_textFieldInput.gridy = 2;
		contentPane.add(textFieldInput, gbc_textFieldInput);
		textFieldInput.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Binary number");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.BELOW_BASELINE_TRAILING;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		textBin = new JTextField();
		textBin.setForeground(new Color(35, 35, 36));
		textBin.setEditable(false);
		GridBagConstraints gbc_textBin = new GridBagConstraints();
		gbc_textBin.gridwidth = 11;
		gbc_textBin.insets = new Insets(0, 0, 5, 0);
		gbc_textBin.fill = GridBagConstraints.HORIZONTAL;
		gbc_textBin.gridx = 2;
		gbc_textBin.gridy = 4;
		contentPane.add(textBin, gbc_textBin);
		textBin.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Decimal number");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textDec = new JTextField();
		textDec.setEditable(false);
		textDec.setForeground(new Color(35, 35, 36));
		GridBagConstraints gbc_textDec = new GridBagConstraints();
		gbc_textDec.gridwidth = 11;
		gbc_textDec.insets = new Insets(0, 0, 5, 0);
		gbc_textDec.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDec.gridx = 2;
		gbc_textDec.gridy = 5;
		contentPane.add(textDec, gbc_textDec);
		textDec.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Hexadecimal number");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 6;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textHex = new JTextField();
		textHex.setEditable(false);
		textHex.setForeground(new Color(35, 35, 36));
		GridBagConstraints gbc_textHex = new GridBagConstraints();
		gbc_textHex.gridwidth = 11;
		gbc_textHex.fill = GridBagConstraints.HORIZONTAL;
		gbc_textHex.gridx = 2;
		gbc_textHex.gridy = 6;
		contentPane.add(textHex, gbc_textHex);
		textHex.setColumns(10);
	}

}
