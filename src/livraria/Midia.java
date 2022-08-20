package livraria;

public class Midia extends Produto {
	
	private String artista;
	
	public Midia(int codigo, float preco, String artista) {
		super(codigo, preco);
		this.setArtista(artista);
	}
	
	@Override
	public float calculaFrete() {
		return this.getPreco() * 0.05f; 
	}
	
	@Override
	public String toString() {
		return "Código: " + this.getCodigo() +
				"Artista: " + this.getArtista() +
				"\nPreço: " + this.getPreco();
	}

	private String getArtista() {
		return artista;
	}

	private void setArtista(String artista) {
		this.artista = artista;
	}
}
