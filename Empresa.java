package criafuncionario;

public class Empresa {
private String nome;
private int cnpj;
private Funcionario[]empregados;
private int numFuncio;
public Empresa(){
	
}
public Empresa(String nome, int numFuncio){
	this.nome=nome;
	this.numFuncio=numFuncio;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getCnpj() {
	return cnpj;
}
public void setCnpj(int cnpj) {
	this.cnpj = cnpj;
}

public Funcionario getFuncionario (int posicao) {
return this.empregados[posicao];
}
}
