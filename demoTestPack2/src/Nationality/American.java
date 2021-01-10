package Nationality;

public class American extends Person {

    String idiom;

    public American( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public String sayHello() {
        return idiom;
    }
}
