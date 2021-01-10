package CarolExample;

public class French implements Person {

    private String name;

    public French(String name){
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
        return "Frances";
    }
}
