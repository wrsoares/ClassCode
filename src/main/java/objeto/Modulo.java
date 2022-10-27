package objeto;

import java.util.ArrayList;
import java.util.List;

public class Modulo {

    String descricao;
    String cargaHoraria;
    List<Nota> notas = new ArrayList<>();

    public Modulo(String descricao, String cargaHoraria) {
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }
}
