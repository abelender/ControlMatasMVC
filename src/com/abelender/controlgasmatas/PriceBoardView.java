package com.abelender.controlgasmatas;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PriceBoardView {
	
	private String strTipoCombustible;
	private String strPrecioCombustible;

	private JLabel tipoCombustible;
	private JPanel panelCombustible;
	private JTextField precioCombustible;
		
	public PriceBoardView(String tipocombustible, String preciocombustible) {
		this.strTipoCombustible = tipocombustible;
		this.strPrecioCombustible = preciocombustible;
		
		tipoCombustible = new JLabel(strTipoCombustible);
		panelCombustible = new JPanel();
		precioCombustible = new JTextField(strPrecioCombustible);
		
	}	
	
	public JPanel getPanel() {
		panelCombustible.add(tipoCombustible);
		panelCombustible.add(precioCombustible);
		return panelCombustible;
	}
	
	public void setPrecio(String precio) {
		precioCombustible.setText(precio);
		
	}	
}
