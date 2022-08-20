package livraria;

public class Livro extends Produto {
	
	private String autor;
	private String editora;
	private int paginas;
	
	public Livro(int codigo, float preco, String autor, String editora, int paginas) {
		super(codigo, preco);
		this.setAutor(autor);
		this.setEditora(editora);
		this.setPaginas(paginas);
	}
	
	@Override
	public float calculaFrete() {
		return this.getPreco() * 0.07f; 
	}
	
	@Override
	public String toString() {
		return "Código: " + this.getCodigo() +
				"Autor: " + this.getAutor() +
				"\nPreço: " + this.getPreco() +
				"\nEditora: " + this.getEditora() +
				"\nN° Paginas:" + this.getPaginas();
	}

	private String getAutor() {
		return this.autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private String getEditora() {
		return this.editora;
	}

	private void setEditora(String editora) {
		this.editora = editora;
	}

	private int getPaginas() {
		return this.paginas;
	}

	private void setPaginas(int paginas) {
		this.paginas = paginas;
	}	
}
