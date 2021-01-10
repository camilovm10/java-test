package GlobantModel;

public class Main {
    public static void main(String[] args) {

        JuniorDeveloper lopez = new JuniorDeveloper("Academy", "Julian Lopez Alazate", "Mobile", 1500 );
        SeniorDeveloper camilo = new SeniorDeveloper("Bank of America", "Juan Camilo Vasquez Mira", "Quality", 3000);
        TechLead juan = new TechLead("Disney", "Hernando Leon Vasquez", "Economic Area", 5500);

        lopez.code();
        juan.meeting();

    }
}
