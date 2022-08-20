package conta;

public class Conta {
	private Integer numero;
	private float saldo;
		
	public Conta(Integer putNumero, float putSaldo) {
		this.numero = putNumero;
		this.saldo = putSaldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void creditaSaldo(float valorCreditado) {
		this.saldo = this.saldo + valorCreditado;
	}
	
	public boolean debitaSaldo(float debitaSaldo) {
		if (this.saldo <= debitaSaldo) {
			return false;
		} else {
			this.saldo = this.saldo - debitaSaldo;
			return true;
		}
	}
}
