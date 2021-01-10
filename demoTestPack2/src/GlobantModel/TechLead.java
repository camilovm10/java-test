package GlobantModel;

public class TechLead extends Glober{

    public TechLead(String project, String name, String studio, int salary) {
        super(project, name, studio, salary);
    }

    public void meeting() {
        System.out.println("Meeting");
    }
}
