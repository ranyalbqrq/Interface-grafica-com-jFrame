package Modelos;

public class Usuario {
	public static String getId;
	private String id;
	private static String usuario;
	private static String senha;
	

public Usuario(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
public Usuario() {
	// TODO Auto-generated constructor stub
}
public String getId() {
	return id;
}
public static  String getUsuario() {
	return usuario;
}
public static String getSenha() {
	return senha;
}
public void setId(String string) {
	this.id = string;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public void insert(Usuario usuarioXande) {
	// TODO Auto-generated method stub
	
} 
}
