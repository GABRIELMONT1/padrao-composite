package hospital;

public class Main {
    public static void main(String[] args) {

        Departamento depto1 = new Departamento("Cardiologia");
        Exame exame11 = new Exame("Eletrocardiograma", 1);
        Exame exame12 = new Exame("Ecocardiograma", 2);
        depto1.addProcedimento(exame11);
        depto1.addProcedimento(exame12);

        Departamento depto2 = new Departamento("Ortopedia");
        Exame exame21 = new Exame("Raio-X", 1);
        depto2.addProcedimento(exame21);

        Departamento plano = new Departamento("Plano Hospitalar");
        plano.addProcedimento(depto1);
        plano.addProcedimento(depto2);

        Paciente paciente = new Paciente();
        paciente.setPlano(plano);

        System.out.println(paciente.getPlano());
    }
}