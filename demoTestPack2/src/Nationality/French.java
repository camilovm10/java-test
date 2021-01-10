package Nationality;

public class French extends Person {

    String idiom;

    public French( String idiom) {
        this.idiom = idiom;
    }


    @Override
    public void sayHello() {
        System.out.println(idiom);
    }
}
