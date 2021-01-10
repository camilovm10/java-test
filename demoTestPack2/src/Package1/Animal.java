package Package1;

public class Animal {

    String roar;
    int NumberFeet = 4;
    private boolean clothes = true;

    public Animal(String roar) {
        this.roar = roar;
    }

    protected void getRoar() {
        System.out.println(roar);
    }

    void getData() {
        System.out.println(NumberFeet);
    }

    public static void main(String[] args) {
        Animal unAnimal = new Animal("oeee");

        System.out.println(unAnimal.clothes);

    }

}
