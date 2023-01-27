public class Pet { 

    String name; 
    Person owner; 
    
    Pet(String PetName, Person OwnerName){

        this.name = PetName; 
        this.owner = OwnerName; 

    }
    void showOwnerName(){
        System.out.println(" my owner names is " + this.name + "My owner name is " + owner.name);
    }
}
