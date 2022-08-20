package livraria;

public class Principal {
	public static void main(String[] args) {
		
		Livro liv = new Livro(2, 36.46f, "Machado de Assis", "Editora Beta", 315);
		Midia mid = new Midia(3, 9.90f, "Metallica");
		
		System.out.println("Livro: ");
		System.out.println(liv.toString() + "\n\n");
		
		System.out.println("CD: ");
		System.out.println(mid.toString() + "\n\n");
		
		System.out.println("Frete do livro: ");
		System.out.println(liv.calculaFrete() + "\n");
		System.out.println("Frete do CD: ");
		System.out.println(mid.calculaFrete());
		
	}
}
