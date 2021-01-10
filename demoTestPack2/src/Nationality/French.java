package Nationality;

public class French extends Person {

    String idiom;

    public French( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public String sayHello() {
        return idiom;
    }
}
