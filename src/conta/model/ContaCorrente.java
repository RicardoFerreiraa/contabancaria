package conta.model;

public class ContaCorrente extends Conta{

	float Limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float Limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.Limite=Limite;
	}

	public float getLimite() {
		return Limite;
	}

	public void setLimite(float limite) {
		Limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.Limite);
	}
}
