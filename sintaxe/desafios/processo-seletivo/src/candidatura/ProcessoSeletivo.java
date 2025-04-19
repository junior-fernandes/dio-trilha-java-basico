package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String [] candidatos = {"Junior", "Daia", "Matteo", "Ravi", "Vovó", "Vovô"};

        for (String candidato: candidatos) {

            entrandoEmContato(candidato);

        }

    }

    static void entrandoEmContato(String candidato) {

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado!");
            }

        } while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não foi possível o contato com " + candidato + ", número máximo de tentativas é " + tentativasRealizadas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {

        String [] candidatos = {"Junior", "Daia", "Matteo", "Ravi", "Vovó", "Vovô"};

        System.out.println("Imprimindo a lista de candidatos");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de n° " + (i + 1) + " é " + candidatos[i]);
        }

        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static  void selecionarCandidatos() {

        String [] candidatos = {"Junior", "Daia", "Matteo", "Ravi", "Vovó", "Vovô"};

        int candidatosSelecionados = 0;
        int candidadosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 &&  candidadosAtual < candidatos.length) {
            String candidato = candidatos[candidadosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salario de " + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidadosAtual++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar p/ candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar p/ candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }

    }

}
