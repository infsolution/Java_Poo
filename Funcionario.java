package criafuncionario;

public class Funcionario {
	static int idFuncionario;
	private String nome;
	private String departamento;
	private Data admicao;
	private String rg;
	private String cpf;
	private double salario;
	public Funcionario(){
	admicao= new Data();	
	}
	public static int getIdFuncionario() {
		return idFuncionario;
	}
	public Funcionario(String nome){
		this.nome= nome;
	}

	void recebeAumento(double aumento){
		this.salario+=aumento;
	}
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getDepartamento() {
		return departamento;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	Data getAdmicao() {
		return admicao;
	}
	void setAdmicao(Data admicao) {
		this.admicao = admicao;
	}
	String getRg() {
		return rg;
	}
	void setRg(String rg) {
		this.rg = rg;
	}
	String getCpf() {
		return cpf;
	}
	void setCpf(String cpf) {
		this.cpf = cpf;
	}
	double getSalario() {
		return salario;
	}
	void setSalario(double salario) {
		this.salario = salario;
	}
	double calculaGanhoAnual(){
		double ganho=this.salario*12;
		return ganho;
	}
	void mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Data de adminição: "+this.admicao);
		System.out.println("RG: "+this.rg);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Salário: "+this.salario);
		System.out.println("Ganho anual: "+this.calculaGanhoAnual());
		System.out.println("Dia: "+admicao.datFormat());
		
	}
}
