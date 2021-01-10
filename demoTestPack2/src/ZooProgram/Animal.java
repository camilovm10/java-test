package ZooProgram;

public class Animal {

    private String name, species, features, mostLike;

    public Animal (String name, String species, String features, String mostLike) {
        this.name = name;
        this.species = species;
        this.features = features;
        this.mostLike = mostLike;
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getSpecies() {
        System.out.println(this.species);
    }

    public void getFeatures() {
        System.out.println(this.features);
    }

    public void getMostLike() {
        System.out.println(this.mostLike);
    }


}
