package ooavc;

public class ContaPoupansa extends Conta {
	void correcao(double taxa) {
		this.saldo += this.saldo *1.3;
	}

}
