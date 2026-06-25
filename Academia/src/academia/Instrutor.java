package academia;

import java.util.List;
import usuario.FichaTreino;

public class Instrutor {
    private int idInstrutor;
    private String nome;
    private String especialidade;
    private String telefone;
    private String cref;
    
    private List<FichaTreino> fichas;
    private Academia academia;

    public Instrutor() {}
    
    //Setters e Getters//
    public int getIdInstrutor() {
    	return idInstrutor; 
    }
    public void setIdInstutor(int idInstutor) { 
    	this.idInstrutor = idInstrutor; 
    }

    
    public String getNome() {
    	return nome; 
    }
    public void setNome(String nome) { 
    	this.nome = nome; 
    }

    
    public String getEspecialidade() { 
    	return especialidade; 
    }
    public void setEspecialidade(String Especialidade) { 
    	this.especialidade = especialidade; 
    }

    
    public String getTelefone() { 
    	return telefone; 
    }
    public void setTelefone(String telefone) { 
    	this.telefone = telefone; 
    }
    
    
    public String getCref() {
    	return this.cref;
    }
    public void setCref(String cref) {
    	this.cref = cref;
    }
    
    }