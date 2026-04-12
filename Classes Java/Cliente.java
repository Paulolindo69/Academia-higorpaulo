import java.time.LocalDate;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;

    public Cliente() {}

    public Cliente(int idCliente, String nome, String cpf, LocalDate dataNascimento, String telefone, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
    }

}