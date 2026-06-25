package academia;

import java.time.LocalDate;
import usuario.Cliente;
import java.util.List;
import java.util.ArrayList;

public class Matricula {
	private int idMatricula;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String plano;
	
	private Cliente cliente;
	private List<Academia> academias;
	
	//Construtor//
    public Matricula() {
    }
    
    //Setters e Getters//
    
    public Cliente getCliente() {
    	return this.cliente;
    }
    public void setCliente(Cliente Cliente) {
    	this.cliente = Cliente;
    }

    
    public int getId() {
    	return this.idMatricula;
    }
    public void setId(int id) {
    	this.idMatricula = id;
    }
    
    
    public LocalDate getInicio() {
    	return this.dataInicio;
    }
    public void setInicio(LocalDate Inicio) {
    	this.dataInicio = Inicio;
    }
    
    
    public LocalDate getFim() {
        return this.dataFim;
    }
    public void setFim(LocalDate Fim) {
        this.dataFim = Fim;
    }
    
    
    public String getPlano() {
    	return this.plano;
    }
    public void setPlano(String Plano) {
    	this.plano = Plano;
    }
}
