public class CodeClass {

    String className = "First";
    String qtdStudents;

    public String setClassName(String className) {
        this.className = className;
        return this.className;
    }

    public void setQtdStudents(String qtdStudents) {
        this.qtdStudents = qtdStudents;
        this.className = "";
    }

}
