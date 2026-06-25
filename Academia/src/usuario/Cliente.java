package usuario;

import java.util.List;
import java.time.LocalDate;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    
    private List<FichaTreino> fichas;

    //Construtor//
    public Cliente() {
    }
    //
    
    //Setters e Getters//
    public int getId() {
    	return this.idCliente;
    }
    public void setId(int idCliente) {
    	this.idCliente = idCliente;
    }
    
    
    public String getNome() {
    	return this.nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public LocalDate getNascimento() {
    	return this.dataNascimento;
    }
    public void setNascimento(LocalDate nascimento) {
    	this.dataNascimento = nascimento;
    }
    
    
    public String getTelefone() {
    	return this.telefone;
    }
    public void setTelefone(String telefone) {
    	this.telefone = telefone;
    }
    
    
    public String getEmail() {
    	return this.email;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
}