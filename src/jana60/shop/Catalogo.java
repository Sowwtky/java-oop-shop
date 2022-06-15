package jana60.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String[] nome = new String [5];
		String[] modello = new String[5];
		double[] prezzo = new double[5];
		int[] iva = new int[5];
		
		for (int i = 0; i < nome.length; i++) {
			
			System.out.print("Inserisci il nome del prodotto da aggiungere al catalogo:");
			nome[i] = scan.nextLine();
			System.out.print("Inserisci il modello del prodotto:");
			modello[i] = scan.nextLine();
			System.out.println("Inserisci il prezzo del prodotto:");
			prezzo[i] = Double.parseDouble(scan.nextLine());
			System.out.println("Inserisci l'iva del prodotto:");
			iva[i] = Integer.parseInt(scan.nextLine());
	
			Prodotto prod = new Prodotto (nome[i], modello[i], prezzo[i], iva[i]);
			
		}
		
		System.out.println("I prodotti inseriti sono: ");
		
		
		scan.close();
	}

}
