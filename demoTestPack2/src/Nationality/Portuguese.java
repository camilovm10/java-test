package Nationality;

public class Portuguese extends Person {

    String idiom;

    public Portuguese( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public void sayHello() {
        System.out.println(idiom);
    }
}
