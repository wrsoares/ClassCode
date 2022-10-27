package basico;

import java.util.ArrayList;
import java.util.List;

public class Basic {

    public static void main(String[] args) {
        //Declaração de variáveis
        int num = 0;
        String text = "";
        boolean flag = false;
        float numFloat = 0.0f;

        //Criando uma lista
        List<String> list = new ArrayList<>();
        //Adicionando elementos na lista
        list.add("Elemento");
        //Acessando elemento na lista
        list.get(0);

        //Percorrendo uma lista e manipulando os elementos dela
        for (String l:list
             ) {
            System.out.println("Elemento da Lista: " + l);
        }

        //Usando if para tomada de decisões
        if (list.size() > 10) {
            System.out.println("Que a lista tem tamanho maior que 10");
        } else if (list.size() < 10) {
            System.out.println("Que a lista tem tamanho menor que 10");
        } else {
            System.out.println("Que a lista tem tamanho igual 10");
        }

        //Instanciação de objetos
        MathOPerations mOperations = new MathOPerations(1, "SOMA");
        //Acessando métodos do objeto
        mOperations.soma(1, 2);

        //Acessando o valor de um atributo do objeto
        System.out.println("Atributo do objeto chamado number: " + mOperations.number);
        System.out.println("Atributo do objeto chamado desc: " + mOperations.desc);

    }

}
