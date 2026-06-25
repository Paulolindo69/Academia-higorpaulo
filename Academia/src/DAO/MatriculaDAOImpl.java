package DAO;

import academia.Matricula;
import usuario.Cliente;

import java.sql.*;


public class MatriculaDAOImpl {
	
	
	public boolean salvar(Matricula matricula) {
		String sql = "INSERT INTO matricula (dataInicio, dataFim, plano, idCliente) VALUES (?,?,?,?)";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setDate(1, Date.valueOf(matricula.getInicio()));
			stmt.setDate(2, Date.valueOf(matricula.getFim()));
			stmt.setString(3, matricula.getPlano());
			stmt.setInt(4, matricula.getCliente().getId());
			
			stmt.executeUpdate();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public Matricula buscarPorId(int id) {
		String sql = "SELECT * FROM matricula WHERE id = ?";
		
		Matricula matricula = null;
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				matricula = new Matricula();
				
				matricula.setId(rs.getInt("id"));
				matricula.setInicio(rs.getDate("dataInicio").toLocalDate());
				matricula.setFim(rs.getDate("dataFim").toLocalDate());
				matricula.setPlano(rs.getString("plano"));
				
				Cliente cliente = new Cliente();
				cliente.setId(rs.getInt("idCliente"));
				
				matricula.setCliente(cliente);	
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			return matricula;
	}
	
	
	public boolean atualizar(Matricula matricula){
		String sql = "UPDATE matricula SET dataInicio = ?, dataFim = ?, plano = ?, idCliente = ? WHERE id = ? ";
		
		try (Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
				
			stmt.setDate(1, Date.valueOf(matricula.getInicio()));
			stmt.setDate(2, Date.valueOf(matricula.getFim()));
			stmt.setString(3, matricula.getPlano());
			stmt.setInt(4, matricula.getCliente().getId());
			
			stmt.setInt(5, matricula.getId());
			
			stmt.executeUpdate();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}		
	}
	
	
	public boolean deletar(int id) {
		String sql = "DELETE FROM matricula WHERE id = ?";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			
			stmt.executeUpdate();
			
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
