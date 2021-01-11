package GlobantModel;

public abstract class Glober {

    private String studio;
    private String project;
    private String name;
    private int salary;

    public Glober(String project, String name, String studio, int salary) {
        this.project = project;
        this.salary = salary;
        this.name = name;
        this.studio = studio;
    }
}
