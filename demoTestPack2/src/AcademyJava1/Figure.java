package AcademyJava1;

public abstract class Figure {

    public int area;

    public Figure(int area) {
        this.area = area;
    }

    public void getHello() {
        System.out.println("Hi from parent");
    }

    public abstract void getArea();

}
