	package academia;
	
	import java.util.List;
	
	public class Academia {
	    private int idAcademia;
	    private String nome;
	    private String endereco;
	    private String telefone;
	    
	    private Instrutor instrutor;
	    private List<Matricula> matriculas;
	
	    public Academia() {}
	    
	    //Setters e Getters//
	    public int getIdAcademia() {
	    	return idAcademia; 
	    }
	    public void setIdAcademia(int idAcademia) { 
	    	this.idAcademia = idAcademia; 
	    }
	
	    
	    public String getNome() {
	    	return nome; 
	    }
	    public void setNome(String nome) { 
	    	this.nome = nome; 
	    }
	
	    
	    public String getEndereco() { 
	    	return endereco; 
	    }
	    public void setEndereco(String endereco) { 
	    	this.endereco = endereco; 
	    }
	
	    
	    public String getTelefone() { 
	    	return telefone; 
	    }
	    public void setTelefone(String telefone) { 
	    	this.telefone = telefone; 
	    }
	    
	    
	    public Instrutor getInstrutor() {
	    	return this.instrutor;
	    }
	    public void setInstrutor(Instrutor instrutor) {
	    	this.instrutor = instrutor;
	    }
	}