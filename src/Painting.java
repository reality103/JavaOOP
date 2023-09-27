
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColor;
    private boolean isFrame;

    public Painting() {
        super();
        height = 0;
        width = 0;
        isWaterColor = true ;
        isFrame = true;
        
    }

    @Override
    public String toString() {
        return super.toString() +  " height=" + height + ", width=" + width + ", isWaterColor=" + isWaterColor + ", isFrame=" + isFrame ;
    }

    public Painting(int value, String creator, int height, int width, boolean isWaterColor, boolean isFrame ) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColor = isWaterColor;
        this.isFrame = isFrame;
    }
    
           
    
}
