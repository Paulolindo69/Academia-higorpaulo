package DAO;

import academia.Academia;

public interface AcademiaDAO {
	
	boolean salvar (Academia academia);
	
	boolean atualizar (Academia academia);
	
	boolean deletar (int id);
	
	Academia buscarporId (int id);

}
