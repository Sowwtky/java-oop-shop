package jana60.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto prod = new Prodotto("Apple", "iPhone 12", 1059.00f, 22);
		System.out.println("Marca prodotto: " + prod.marca);
		System.out.println("Nome prodotto: " + prod.nome);
		System.out.println("Prezzo: " + prod.prezzo);
		System.out.println("Iva applicata: " + prod.iva + "%");
		System.out.println(prod.formatText());
		
	}

}
