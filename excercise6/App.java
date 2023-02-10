public class App {
    public static void main(String[] args) throws Exception{

         Groceryitem item1 = new Groceryitem(); 

         item1.name = "vicks inhaler";
         item1.price = 60;
         item1.showItemName(); 
         item1.showprice();

         Groceryitem item2 = new toothpaste(); 

         item2.name = "sensodyne";
         item2.price = 40;
         item2.showItemName(); 
         item2.showprice();
         Groceryitem item3 = new toothbrush(); 

         item3.name = "sharpiro";
         item3.price = 50;
         item3.showItemName();
         item3.showprice();

        Cashier c1 = new Cashier();
        c1.CheckOut(item1);
        c1.CheckOut(item2);
        c1.CheckOut(item3);

        Groceryitem[] itemArray = new Groceryitem[3]; 
        itemArray[0] = item1;
        itemArray[1] = item2;
        itemArray[2] = item3; 

        for (int i = 0; i < itemArray.length; i++){
            itemArray[i].showItemName(); 

            dragon myDragon = new dragon();
            myDragon.eat(); 
        
            Lion mylLion = new Lion(); 
            mylLion.walk();
            mylLion.run();

        }
    } 
    }
 
