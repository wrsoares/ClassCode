public class Runner {
    /*
     * Author: William Soares
     * Date: 17/10/2022
     * Description: Executor classes instances
     * */
    public static void main(String[] args) {
        //Criando instâncias (Objetos) da classe CodeClass
        CodeClass firstClass = new CodeClass();
        CodeClass secondClass = new CodeClass();
        CodeClass thirdClass = new CodeClass();

        //Manipulando o retorno do método setClassName
        String value = firstClass.setClassName("First");
        String secondValue = secondClass.setClassName("Second");

        //Imprimindo os valores de retorno
        System.out.println(value);
        System.out.println(value);
        System.out.println(secondValue);
        System.out.println(thirdClass.setClassName("Third"));
    }

}
