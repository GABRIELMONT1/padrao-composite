package hospital;

import java.util.ArrayList;
import java.util.List;

public class Departamento extends Procedimento {

    private List<Procedimento> procedimentos;

    public Departamento(String descricao) {
        super(descricao);
        this.procedimentos = new ArrayList<Procedimento>();
    }

    public void addProcedimento(Procedimento procedimento) {
        this.procedimentos.add(procedimento);
    }

    public String getProcedimento() {
        String saida = "";
        saida = "Departamento: " + this.getDescricao() + "\n";
        for (Procedimento procedimento : procedimentos) {
            saida += procedimento.getProcedimento();
        }
        return saida;
    }
}