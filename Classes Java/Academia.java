public class Academia {
    private int idAcademia;
    private String nome;
    private String endereco;
    private String telefone;

    public Academia() {}

    public Academia(int idAcademia, String nome, String endereco, String telefone) {
        this.idAcademia = idAcademia;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdAcademia() { return idAcademia; }
    public void setIdAcademia(int idAcademia) { this.idAcademia = idAcademia; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}