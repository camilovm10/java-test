package GlobantModel;

public class JuniorDeveloper extends Person implements Programmer {



    public JuniorDeveloper(String project, String name, String apellido, String studio, int salary) {
        super(project, name, apellido, studio, salary);
    }

    @Override
    public void code() {
        System.out.println("Programming");
    }

    @Override
    public void toWalk() {
        System.out.println("walking");
    }
}
