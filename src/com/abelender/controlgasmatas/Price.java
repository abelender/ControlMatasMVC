package com.abelender.controlgasmatas;

/*
 * Esta clase define un objeto que guarda información de los elementos 
 * definida en el cuerpo del archivo xml ubicado en: https://bit.ly/2JNcTha. 
 * 
 * 		<places>		
 *			 <place place_id="11703">
 *   			<gas_price type="regular">14.99</gas_price>
 *   			<gas_price type="premium">15.99</gas_price>
 * 			 </place>
 * 			.
 * 			.
 * 			.
 * 			.
 *      </places>
 * 
 * 			+ String gas_price: Guarda el valor definido dentro de la etiqueta <gas_price>
 * 			+ String type:		Guarda el valor del atributo 'type' de la etiqueta <gas_price>
 * 			+ String place_id:	Guarda el valor del atributo 'place_id'de la etiqueta <place>
 * 
 * */

public class Price {
	
	private String gas_price;
	private String type;
	private String place_id;
	private String place;
	
	public Price() {
		
	}
	
	public Price(String place_id, String gas_price, String type, String place ) {
		
		this.place_id = place_id;
		this.gas_price = gas_price;
		this.type = type;
		this.place = place;	
	}

	public void setGas_price(String temp) {
		this.gas_price = temp;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getGas_price() {
		return gas_price;
	}

	public String getType() {
		return type;
	}

	public String getPlace() {
		return place;
	}

	public String getPlace_id() {
		return place_id;
	}
	
	public String toString() {
		
		  StringBuffer sb = new StringBuffer();
		  sb.append("Detalles: ");
		  sb.append("ID Estacion: " + place_id + ", ");
		  sb.append("Tipo: " + type + ", ");
		  sb.append("Precio: " + gas_price + ".");

		  return sb.toString();
	}
}

