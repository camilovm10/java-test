package AcademyJava1;

public class Rectangle extends Figure {

    public Rectangle(int area) {
        super(area);
    }

    public void getHello() {
        System.out.println("Hi from children");
    }

    @Override
    public void getArea() {
        System.out.println("getting area of a square");
    }


}
