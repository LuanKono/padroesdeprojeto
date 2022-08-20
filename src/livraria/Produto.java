package livraria;

public abstract class Produto {
	private int codigo;
	private float preco;
	
	public Produto(int codigo, float preco) {
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public abstract float calculaFrete();
		
}
