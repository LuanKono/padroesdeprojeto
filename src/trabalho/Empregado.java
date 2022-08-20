package trabalho;

import java.time.LocalDate;

public abstract class Empregado {

	private String nome;
	private String email;
	private int anoContratacao;

	public Empregado(String nome, String email, int anoContratacao) {
		this.setNome(nome);
		this.setEmail(email);
		this.setAnoContratacao(anoContratacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnoContratacao() {
		return anoContratacao;
	}

	public void setAnoContratacao(int anoContratacao) {
		this.anoContratacao = anoContratacao;
	}

	public abstract float ganha();

	public int tempoCasa() {
		LocalDate data_local = LocalDate.now();
		int anoAtual = data_local.getYear();
		return anoAtual - this.anoContratacao;
	}

}
