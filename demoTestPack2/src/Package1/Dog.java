package Package1;

public class Dog extends Animal {

    String race, color;

    public Dog(String roar, String race, String color) {
        super(roar);
        this.color = color;
        this.race = race;
    }

    private void getColor() {
        System.out.println(color);
    }

    public void getRace() {
        System.out.println(race);
    }

    public static void main( String[] args ) {


        Dog kenzo = new Dog("Guau guau", "French Bulldog", "Black");

        kenzo.getColor();
        kenzo.getRoar();



    }
}
