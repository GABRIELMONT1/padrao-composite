package hospital;

public abstract class Procedimento {

    private String descricao;

    public Procedimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public abstract String getProcedimento();
}