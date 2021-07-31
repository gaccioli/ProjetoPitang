package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url= "jdbc:mysql://127.0.0.1:3306/cadastro?useTimezone=true&serverTimezone=UTC";
	
	private String user="root";
	private String password = "root";
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	

	}
	
	/*
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	*/
	
	public void inserirUsuario(JavaBeans usuario) {
		String create = "insert into users (nome,email,fone_ddd,fone_numero,fone_tipo,senha) values (?,?,?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getEmail());
			pst.setInt(3, usuario.getFone_ddd());
			pst.setString(4, usuario.getFone_numero());
			pst.setString(5, usuario.getFone_tipo());
			pst.setString(6, usuario.getSenha());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	 
	public ArrayList<JavaBeans> listarUsuarios() {
		ArrayList<JavaBeans> usuarios = new ArrayList<>();
		String read = "select id, nome, email, fone_ddd, fone_numero, fone_tipo from users order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nome = rs.getString(2);
				String email = rs.getString(3);
				int fone_ddd = rs.getInt(4);
				String fone_numero = rs.getString(5);
				String fone_tipo = rs.getString(6);
				String senha = rs.getString(7);
				usuarios.add(new JavaBeans(id, nome, email, fone_ddd, fone_numero, fone_tipo,senha));
			}
			con.close();
			return usuarios;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void selecionarUsuario(JavaBeans usuario) {
		String read2 = "select * from contatos where id = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, usuario.getId());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				usuario.setId(rs.getString(1));
				usuario.setNome(rs.getString(2));
				usuario.setEmail(rs.getString(3));
				usuario.setFone_ddd(rs.getInt(4));
				usuario.setFone_numero(rs.getString(5));
				usuario.setFone_tipo(rs.getString(6));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void alterarUsuario(JavaBeans usuario) {
		String update = "update users set nome=?,email=?,fone_ddd=?,fone_numero=?,fone_tipo=?,senha=? where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getEmail());
			pst.setInt(3, usuario.getFone_ddd());
			pst.setString(4, usuario.getFone_numero());
			pst.setString(5, usuario.getFone_tipo());
			pst.setString(6, usuario.getSenha());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	public void deletarUsuario(JavaBeans usuario) {
		String delete = "delete from userswhere id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, usuario.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
