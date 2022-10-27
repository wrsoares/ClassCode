package objeto;

public class Executor {

    public static void main(String[] args) {
        //Instanciando objeto Nota
        Nota nota = new Nota();
        //Carregando valores
        nota.notaParticipacao = 10;
        nota.notaQuiz = 9;
        nota.notaTrabalhoFinal = 7;

        //Instanciando objeto e inserindo valores no construtor
        Modulo testesAgeis = new Modulo("Módulo Testes Ágeis", "40h");
        testesAgeis.notas.add(nota);

        //Instanciando objeto e inserindo valores no construtor
        Modulo automacaoI = new Modulo("Módulo Automação I", "120h");
        automacaoI.notas.add(nota);

        //Instanciando objeto e inserindo valores no construtor
        Estudante estudante = new Estudante("Josimar Dantas", "1234");
        //Adicionando objetos em lista do Estudante: modulos -> modulo
        estudante.modulos.add(testesAgeis);
        estudante.modulos.add(automacaoI);

        System.out.println(estudante.nome);
        //Imprimindo informações do estudante
        for (Modulo modulo: estudante.modulos
             ) {
            System.out.println("------------------------------------");
            System.out.println(modulo.descricao);
            System.out.println("Nota de participação: " + modulo.notas.get(0).notaParticipacao);
            System.out.println("Nota do quiz: " + modulo.notas.get(0).notaQuiz);
            System.out.println("Nota do trabalho final: " + modulo.notas.get(0).notaTrabalhoFinal);
            System.out.println("------------------------------------");
        }



    }

}
