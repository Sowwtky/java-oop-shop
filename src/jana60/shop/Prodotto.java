package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	String marca;
	String nome;
	float prezzo;
	int iva;
	
	Prodotto(String marca, String nome, float prezzo, int iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	float calcPrezzo () {
		float prezzoIva = prezzo + (prezzo * iva) / 100;
		return prezzoIva;
	}
	
	DecimalFormat df = new DecimalFormat("###0.##");
	String formatText () {
		String formatStr = "Il prezzo totale del prodotto é " + df.format(calcPrezzo()) + "€";
		return formatStr;
	}
}
