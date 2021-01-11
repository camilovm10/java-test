package GlobantModel;

public class Person extends Glober {

    private String apellido;

    public Person(String project, String name, String apellido, String studio,  int salary) {
        super(project, name, studio, salary);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
}
