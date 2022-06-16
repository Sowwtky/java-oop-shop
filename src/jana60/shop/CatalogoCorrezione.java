package jana60.shop;

import java.util.Arrays;
import java.util.Scanner;

public class CatalogoCorrezione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Prodotto[] catalogo = new Prodotto[5];
		
		for (int i = 0; i < catalogo.length; i++) {
			
			System.out.print("Inserisci la marca del prodotto da aggiungere al catalogo:");
			String marca = scan.nextLine();
			System.out.print("Inserisci il nome del prodotto:");
			String nome = scan.nextLine();
			System.out.print("Inserisci il prezzo del prodotto:");
			double prezzo = Double.parseDouble(scan.nextLine());
			System.out.print("Inserisci l'iva del prodotto:");
			int iva = Integer.parseInt(scan.nextLine());
			
			catalogo[i] = new Prodotto (marca, nome, prezzo, iva);
		}
		
		for (int i = 0; i < catalogo.length; i++) {
			System.out.println(Arrays.asList(catalogo[i].infoProdotto()));
		}
	}
}
