package trabalho;

public class PorItem extends Empregado {

	private float valor_producao;
	private int quantidade;

	public PorItem(String nome, String email, int anoContratacao, float valor_producao, int quantidade) {
		super(nome, email, anoContratacao);
		this.setValor_producao(valor_producao);
		this.setQuantidade(quantidade);
	}

	public float getValor_producao() {
		return valor_producao;
	}

	public void setValor_producao(float valor_producao) {
		this.valor_producao = valor_producao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float ganha() {
		float salario = this.valor_producao * this.quantidade;
		return salario;
	}

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nEmail: " + this.getEmail() + "\nAno de contratação: " + this.getAnoContratacao() + "\nValor produção: " + this.valor_producao + "\nQuantidade produzida: " + this.quantidade;
	}
}
