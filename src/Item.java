
public class Item {
    private int value;
    private String creator;

    public Item() {
        value = 0;
        creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        String name = this.getClass().getSimpleName();
        
        return name + ": value=" + value + ", creator=" + creator ;
    }
    
    
    
}
