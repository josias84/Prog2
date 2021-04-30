package ooavc;

public class Caixa extends FuncionarioEspecial implements AcessoBancoInterno{
	int senha;
	
	public boolean verifica(int senha) {
		//metodo de verificacao da senha
		//implementacao diferente do metodo
		//da classe Gerente
		return false;
	}
	double getBonus() {
		return 0;
	}
	protected void verifica() {
		// TODO Auto-generated method stub
		
	}

}
