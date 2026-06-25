package DAO;

import usuario.Cliente;

public interface ClienteDAO {
	
	boolean salvar (Cliente cliente);
	
	boolean atualizar (Cliente cliente);
	
	boolean deletar (int id);
	
	Cliente buscarporId (int id);
	
	
}
