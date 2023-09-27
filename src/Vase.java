/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minh Phuong
 */
public class Vase extends Item{
   private int height;
   private String material;

    public Vase() {
        super();
        height = 0;
        material = "";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
   
    
    
    @Override
    public String toString() {
        return super.toString() + ", height=" + height + ", material=" + material ;
    }
    
}
