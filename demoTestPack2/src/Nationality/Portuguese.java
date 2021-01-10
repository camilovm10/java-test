package Nationality;

public class Portuguese extends Person {

    String idiom;

    public Portuguese( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public String sayHello() {
        return idiom;
    }
}
