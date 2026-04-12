import java.time.LocalDate;

public class FichaTreino {
    private int idFicha;
    private String objetivo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private Instrutor instrutor;

    public FichaTreino() {}

    public FichaTreino(int idFicha, String objetivo, LocalDate dataInicio, LocalDate dataFim, Cliente cliente, Instrutor instrutor) {
        this.idFicha = idFicha;
        this.objetivo = objetivo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.cliente = cliente;
        this.instrutor = instrutor;
    }

}