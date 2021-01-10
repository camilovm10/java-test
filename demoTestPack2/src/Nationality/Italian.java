package Nationality;

public class Italian extends Person {
    String idiom;

    public Italian( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public void sayHello() {
        System.out.println(idiom);
    }
}
