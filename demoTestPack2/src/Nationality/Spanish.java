package Nationality;

public class Spanish extends Person {

    String idiom;

    public Spanish( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public String sayHello() {
        return idiom;
    }
}
