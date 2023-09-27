/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minh Phuong
 */
public class Antiqueshop {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item();
        System.out.println(i1);
        Vase v1 = new Vase(20000, "Ninh Binh", 20 , "Gold");
        Statue s2 = new Statue(10000, "Ha Noi", 70, "Blue");
        Painting p3 = new Painting(40000, "Ninh Binh Province", 20, 10, true, true);
        int MAX_ITEMS = 10000;
        Item[] listItems = new Item[MAX_ITEMS];
        listItems[0] = v1;
        listItems[1] = s2;
        listItems[2] = p3;
        listItems[3] = i1;
        System.out.println("List all items in the antique shop:");
            for (int i = 0; i <= 3; i++){
                System.out.println(listItems[i]);
            }
        String creator = "Ha Noi";
        int count = 0;
        System.out.println("Find items by creator in listItems:");
            for (int i = 0; i<= 3; i++){
                
                Item i2 = listItems[i];
                if (i2.getCreator().contains(creator)){
                    count++;
                    System.out.println(i2);
                }
            }
        System.out.println("listItems has " + count + " items made by creator " + creator);
            
        
      
       
       
        
        
    }
    
}
