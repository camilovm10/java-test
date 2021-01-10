package Nationality;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> arrayPeople = new ArrayList<>();

        French fr = new French("Oi");
        American am = new American("Hi");
        Spanish milo = new Spanish("Hola");
        Italian it = new Italian("Hoi");
        Portuguese pt = new Portuguese("ola");

        arrayPeople.add(fr);
        arrayPeople.add(am);
        arrayPeople.add(milo);
        arrayPeople.add(it);
        arrayPeople.add(pt);

        for ( Person person : arrayPeople ) {
            System.out.println(person.sayHello());
        }



    }
}
