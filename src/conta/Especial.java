package conta;

public class Especial extends Conta {
	private float limite;

	public Especial(Integer putNumero, float putSaldo, float limite) {
		super(putNumero, putSaldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Numero:" + this.getNumero() + "\nSaldo:" + this.getSaldo();
	}

}
