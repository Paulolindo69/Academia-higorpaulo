package usuario;

import academia.Maquina;

public class Exercicios {
	private int idExercicios;
    private int series;
    private int repeticoes;
    private int descanso;
    
    private Maquina maquina;
    private FichaTreino ficha;

    public Exercicios(FichaTreino ficha, Maquina maquina, int series, int repeticoes) {
        this.ficha = ficha;
        this.maquina = maquina;
        this.series = series;
        this.repeticoes = repeticoes;
    }

}