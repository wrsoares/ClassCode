package basico;

public class MathOPerations {

    int number;
    String desc;
    public MathOPerations(int number, String desc) {
        this.number = number;
        this.desc = desc;
    }

    public int soma(int num, int num2) {
        int soma = num + num2;
        return soma;
    }

    public void comparaValor(int valor, int valorSoma) {
        if (valor > valorSoma) {
            System.out.println("Valor do parâmetro é maior que o da soma");
        } else if (valor < valorSoma) {
            System.out.println("Valor do parâmetro é menor que o da soma");
        } else {
            System.out.println("Valor do parâmetro é igual o da soma");
        }
    }

}