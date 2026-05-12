package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PacienteTeste {

    @Test
    void deveRetornarPlanoPaciente() {
        Departamento depto1 = new Departamento("Cardiologia");

        Departamento depto2 = new Departamento("Ortopedia");
        Exame exame21 = new Exame("Raio-X", 1);
        depto2.addProcedimento(exame21);

        Departamento depto3 = new Departamento("Neurologia");
        Exame exame31 = new Exame("Eletroencefalograma", 2);
        Exame exame32 = new Exame("Ressonancia", 3);
        depto3.addProcedimento(exame31);
        depto3.addProcedimento(exame32);

        Departamento plano = new Departamento("Plano Hospitalar");
        plano.addProcedimento(depto1);
        plano.addProcedimento(depto2);
        plano.addProcedimento(depto3);

        Paciente paciente = new Paciente();
        paciente.setPlano(plano);

        assertEquals("Departamento: Plano Hospitalar\n" +
                "Departamento: Cardiologia\n" +
                "Departamento: Ortopedia\n" +
                "Exame: Raio-X - duracao: 1\n" +
                "Departamento: Neurologia\n" +
                "Exame: Eletroencefalograma - duracao: 2\n" +
                "Exame: Ressonancia - duracao: 3\n", paciente.getPlano());
    }

    @Test
    void deveRetornarExcecaoPacienteSemPlano() {
        try {
            Paciente paciente = new Paciente();
            paciente.getPlano();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Paciente sem plano", e.getMessage());
        }
    }
}