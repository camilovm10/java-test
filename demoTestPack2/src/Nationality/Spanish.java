package Nationality;

public class Spanish extends Person {

    String idiom;

    public Spanish( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public void sayHello() {
        System.out.println(idiom);
    }
}
