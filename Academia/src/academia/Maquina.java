package academia;

import usuario.Exercicios;
import java.util.List;

public class Maquina {
    private int idMaquina;
    private String nome;
    
    private List<Exercicios> exercicios;

    public Maquina(int idMaquina, String nome) {
        this.idMaquina = idMaquina;
        this.nome = nome;
    }

}