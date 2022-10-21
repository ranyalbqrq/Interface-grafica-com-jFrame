package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Modelos.Usuario;
import dao.UsuarioDao.Connectionconexao;

public class UsuarioDao {
	public class Connectionconexao {

		public static Connection getConnection() {
			// TODO Auto-generated method stub
			return null;
		}

		public static void closeConnection(Connection con, PreparedStatement stat) {
			// TODO Auto-generated method stub
			
		}

	}

	public void create() {
	
	Connection con = Connectionconexao.getConnection();
	PreparedStatement stat= null;
	try {
		stat= con.prepareStatement("insert into usuario(id,usuario, senha)values(?,?,?)");
		stat.setString(1, Usuario.getId);
		stat.setString(2, Usuario.getUsuario());
		stat.setString(3, Usuario.getSenha());
		
		stat.executeUpdate();
		
		JOptionPane.showConfirmDialog(null, "salvo com sucesso");
		
	} catch (Exception e) {
		JOptionPane.showConfirmDialog(null, "erro ao salvar");
	}
	finally {
		Connectionconexao.closeConnection(con, stat);
		
	}
	
	
	}

	public void insert(Usuario usuarioXande) {
		// TODO Auto-generated method stub
		
	}
}
		
	
	
	

