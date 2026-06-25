package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import academia.Academia;

public class AcademiaDAOImpl implements AcademiaDAO{
	public boolean salvar(Academia academia) {
		String sql = "INSERT INTO academia (id_academia,nome,endereco,telefone,id_instrutor) VALUES (?,?,?,?,?)";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, academia.getIdAcademia());
			stmt.setString(2, academia.getNome());
			stmt.setString(3, academia.getEndereco());
			stmt.setString(4, academia.getTelefone());
			
			stmt.setInt(5, academia.getInstrutor().getIdInstrutor());
			stmt.executeUpdate();
			return true;
			
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	public boolean atualizar(Academia academia) {
		String sql = "UPDATE academia SET nome = ?, endereco = ?, telefone = ?, WHERE id = ?";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, academia.getNome());
			stmt.setString(2, academia.getEndereco());
			stmt.setString(3, academia.getTelefone());
			
			stmt.executeUpdate();
			return true;
			
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}

	}
	public boolean deletar(int id) {
		String sql = "DELETE FROM academia WHERE id_academia = ?";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			return true;
			
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	public Academia buscarporId(int id) {
		String sql = "SELECT * FROM academia WHERE id_academia = ?";
		
		Academia academia = null;
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				academia = new Academia();
				
				academia.setIdAcademia(rs.getInt("id_academia"));
				academia.setNome(rs.getString("nome"));
				academia.setEndereco(rs.getString("email"));
				academia.setTelefone(rs.getString("telefone"));
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return academia;
	}
}
