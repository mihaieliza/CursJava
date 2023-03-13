package curs5;

public class TestStatic {
    public static void main(String[] args) {

        VariableScope variableScope = new VariableScope();
        variableScope.prenume = "Test"; //apelata prin intermediul obiectului
        VariableScope.nume = "Static"; // apelata prin numele clasei, fiind variabila de instanta
    }
}
