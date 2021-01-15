package GlobantModel;

public class JuniorDeveloper extends Glober implements Programmer {



    public JuniorDeveloper(String project, String name, String studio, int salary) {
        super(project, name, studio, salary);
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
