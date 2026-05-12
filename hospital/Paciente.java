package hospital;

public class Paciente {

    private Procedimento plano;

    public void setPlano(Procedimento plano) {
        this.plano = plano;
    }

    public String getPlano() {
        if (this.plano == null) {
            throw new NullPointerException("Paciente sem plano");
        }
        return this.plano.getProcedimento();
    }
}