package objeto;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    String nome;
    String matricula;
    List<Modulo> modulos = new ArrayList<>();

    public Estudante(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}
