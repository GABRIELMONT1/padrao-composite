package hospital;

public class Exame extends Procedimento {

    private int duracao;

    public Exame(String descricao, int duracao) {
        super(descricao);
        this.duracao = duracao;
    }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }

    public String getProcedimento() {
        return "Exame: " + this.getDescricao() + " - duracao: " + this.duracao + "\n";
    }
}