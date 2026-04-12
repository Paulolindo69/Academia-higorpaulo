public class FichaMaquina {
    private FichaTreino ficha;
    private Maquina maquina;
    private int series;
    private int repeticoes;

    public FichaMaquina() {}

    public FichaMaquina(FichaTreino ficha, Maquina maquina, int series, int repeticoes) {
        this.ficha = ficha;
        this.maquina = maquina;
        this.series = series;
        this.repeticoes = repeticoes;
    }

}