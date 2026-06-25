package DAO;

import usuario.Cliente;
import java.sql.*;

public class ClienteDAOImpl implements ClienteDAO{
	
	
	
	public boolean salvar(Cliente cliente) {
			
			if (cliente.getCpf() == null || cliente.getCpf().isBlank()){
				System.out.println("Insira um Cpf!");
				return false;
			}
			if (cliente.getNome() == null || cliente.getNome().isBlank()){
				System.out.println("Insira um Nome!");
				return false;
			}
			if (cliente.getTelefone() == null || cliente.getTelefone().isBlank()){
				System.out.println("Insira um telefone!");
				return false;
			}
			if (cliente.getNascimento() == null){
				System.out.println("Insira uma data de nascimento!");
				return false;
			}
			if (cliente.getEmail() == null || cliente.getEmail().isBlank()){
				System.out.println("Insira um email!");
				return false;
			}
			
			String sql = "INSERT INTO clientes (cpf,nome,email,data_nascimento,telefone) VALUES (?,?,?,?,?)";
			try(Connection conn = DBConnection.getInstance().getConnection();
					PreparedStatement stmt = conn.prepareStatement(sql)){
				stmt.setString(1, cliente.getCpf());
			    stmt.setString(2, cliente.getNome());
				stmt.setString(3, cliente.getEmail());
				stmt.setDate(4, java.sql.Date.valueOf(cliente.getNascimento()));
				stmt.setString(5, cliente.getTelefone());
				
				stmt.executeUpdate();
			return true;
			
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public boolean atualizar(Cliente cliente) {
		String sql = "UPDATE clientes SET cpf = ?, nome = ?, email = ?, data_nascimento = ?, telefone = ? WHERE id_cliente = ?";
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getEmail());
			stmt.setDate(4, java.sql.Date.valueOf(cliente.getNascimento()));
			stmt.setString(5, cliente.getTelefone());
			stmt.setInt(6, cliente.getId());
			
			stmt.executeUpdate();
			return true;
			
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public boolean deletar(int id) {
		String sql = "DELETE FROM clientes WHERE id_cliente = ?";
		
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
	
	
	
	public Cliente buscarporId(int id) {
		String sql = "SELECT * FROM clientes WHERE id_cliente = ?";
		
		Cliente cliente = null;
		
		try(Connection conn = DBConnection.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				cliente = new Cliente();
				
				cliente.setId(rs.getInt("id_cliente"));
				cliente.setCpf(rs.getString("cpf"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEmail(rs.getString("email"));
				cliente.setNascimento(rs.getDate("data_nascimento").toLocalDate());
				cliente.setTelefone(rs.getString("telefone"));
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return cliente;
	}
}