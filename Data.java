package criafuncionario;

public class Data {
	int dia;
	int mes;
	int ano;
	public Data(){
		
	}
	public Data(String data){
		
	}
	String datFormat(){
		String dia = Integer.toString(this.dia);
		String mes  = Integer.toString(this.mes);
		String ano = Integer.toString(this.ano);
		String dat = dia+"-"+mes+"-"+ano;
		return dat;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
