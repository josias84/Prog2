package ooavc;

public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected String dataAdmiss�o;
	protected double salario;
	protected String status;
	
//	v1 do bonus: valor fixo
//	void bonificacao(double bonus) {
//		salario += bonus;
//	}
	
//	v2 do bonus percent 5% fixo sobre o salario
//	double getBonus() {
//		return this.salario * 0.05;
//	}
	//v3 com a classe Funcionario abstract
	abstract double getBonus();
//	{
//		return this.salario * 0.05;
//	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDataAdmiss�o() {
		return dataAdmiss�o;
	}
	public void setDataAdmiss�o(String dataAdmiss�o) {
		this.dataAdmiss�o = dataAdmiss�o;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	protected abstract void verifica();


}
