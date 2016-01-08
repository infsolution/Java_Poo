package criafuncionario;

public class PessoaFisica {
private String nome;
private String cpf;
private String rg;
private Data dtNasc;
public PessoaFisica(String cpf){
	this.cpf=cpf;
}

public boolean validaCpf(String cpf){
	boolean ok=false;
	if(cpf.length()==11)
		ok=true;
	return ok;
}
}

