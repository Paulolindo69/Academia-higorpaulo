package DAO;

import academia.Matricula;

public interface MatriculaDAO {
	
	boolean salvar (Matricula matricula);
	
	boolean atualizar (Matricula matricula);
	
	boolean deletar (int id);
	
	Matricula buscarporId(int id);
}
