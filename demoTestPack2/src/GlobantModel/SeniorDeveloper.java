package GlobantModel;

public class SeniorDeveloper extends Glober implements Programmer{

    public SeniorDeveloper(String project, String name, String studio, int salary) {
        super(project, name, studio, salary);
    }

    @Override
    public void code() {
        System.out.println("Coding");
    }

    @Override
    public void toWalk() {
        System.out.println("walking");
    }
}
