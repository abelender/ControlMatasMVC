package com.abelender.controlgasmatas;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestClass implements ActionListener {
	
	private static PriceBoardView magna;

	public static void main(String[] args) {
		
//		SAXParserModel myModel = new SAXParserModel();
//		myModel.get
		
		String precio = "13.89";
		JButton boton = new JButton("Cambiar");
		JPanel panel = new JPanel();
		
		
		JFrame frame = new JFrame("Testing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		
		magna = new PriceBoardView("magna", precio);

		panel.add(magna.getPanel());
		panel.add(boton);
		frame.getContentPane().add(panel);
		frame.setResizable(false);
		
		

		frame.setVisible(true);

	

	ActionListener actionListener = new ActionListener() {
        public void actionPerformed(ActionEvent event) {
           String str = "20.34";
           magna.setPrecio(str);
        }
     };
     
     boton.setActionCommand("FirstButton");
	 boton.addActionListener(actionListener);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
