
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
        super();
        weight = 0;
        colour = "";
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value,creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + "weight=" + weight + ", colour=" + colour + '}';
    }
    
    
    
}
