package Nationality;

public class Italian extends Person {
    String idiom;

    public Italian( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public String sayHello() {
        return idiom;
    }
}
