package conta.model;

public class ContaPoupanca extends Conta {

	private int Aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int Aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.Aniversario= Aniversario;

	}

	public int getAniversario() {
		return Aniversario;
	}

	public void setAniversario(int aniversario) {
		Aniversario = aniversario;
	}
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.Aniversario);
	}
}