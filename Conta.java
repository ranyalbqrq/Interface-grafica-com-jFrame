class Conta  {
private String numero;
private String nome;
private String seguro;

public Conta(String numero, String nome, String seguro) {
	this.numero = numero; 
	this.nome = nome;
	this.seguro= seguro; 
}
public String getNome() {
	return nome;
}
public String getNumero() {
	return numero;
}
public String getSeguro() {
	return seguro;
}
public void setNome(String nome) {
	this.nome = nome;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public void setSeguro(String seguro) {
	this.seguro = seguro;
} 
}
