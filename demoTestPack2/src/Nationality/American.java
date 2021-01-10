package Nationality;

public class American extends Person {

    String idiom;

    public American( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public void sayHello() {
        System.out.println(idiom);
    }
}
