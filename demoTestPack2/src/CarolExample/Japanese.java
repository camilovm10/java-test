package CarolExample;

public class Japanese implements Person {
    public String name;

    public Japanese(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Japones";
    }
}
