public class Car {
    String name; 
    Myself owner; 
    
    Car (String CarName, Myself OwnerName){

        this.name = CarName; 
        this.owner = OwnerName; 

    }
    void showCar(){
        System.out.println(" Car Brand And Model: " + this.name + "  Owner Name : " + owner.name);
    }
}
