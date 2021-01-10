package ZooProgram;

public class Main {

    public static void main(String[] args) {

        Animal lion = new Animal("Lion", "Panthera leo", "hairy, furios and big carnivorous cat", "I like his hair");

        Animal elephant = new Animal("Elephant", "Loxodonta africana", "long term memory, hard skin, long trunk", "He is very cute, his nose is really long");

        Animal rhino = new Animal("Rhino", "Diceros bicornis", "Grey skin, big horn as their nose", "Their horns are scary :(");

        rhino.getFeatures();

    }

}
