package CarolExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> personList= new ArrayList<Person>();
        French french = new French("Pierre");
        Portuguese portuguese = new Portuguese("Marcelo");
        Japanese japanese = new Japanese("Goku");
        Person felipe = new French("Felipe");

        personList.add(french);
        personList.add(portuguese);
        personList.add(japanese);
        personList.add(felipe);

        for(Person person : personList){
            System.out.println(person.getName() + " speaks in "+  person.speak());
        }
    }
}
