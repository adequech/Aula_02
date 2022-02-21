package pr.senac.br;

public class Conta{
	public int numero;
	public float saldo;
	
	public void creditaSaldo(float valorCreditado){
		this.saldo = this.saldo + valorCreditado;
	}
	
	public String retornaConta(){
		return "Numero: " + this.numero + " Saldo: " + this.saldo;
	}

	public void debitaSaldo(float valorDebitado){
		this.saldo = this.saldo - valorDebitado;
	}
}



