package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	String marca;
	String nome;
	double prezzo;
	int iva;
	
	Prodotto(String marca, String nome, double prezzo, int iva) {
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	double calcPrezzo () {
		double prezzoIva = prezzo + (prezzo * iva) / 100;
		return prezzoIva;
	}
	
	DecimalFormat df = new DecimalFormat("###0.##");
	String formatText () {
		String formatStr = "Il prezzo totale del prodotto é " + df.format(calcPrezzo()) + "€";
		return formatStr;
	}
}
