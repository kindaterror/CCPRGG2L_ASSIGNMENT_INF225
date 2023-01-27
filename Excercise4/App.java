public class App {
    public static void main(String[] args) throws Exception {
       
    Person friend = new Person(" ben ",18);

    Myself Me = new Myself ("onag",19);

    Me.addFriend(friend);


    Pet kangaroo = new Pet(" pacquiao ", friend);
    
    kangaroo.showOwnerName();
 
    Car car = new Car("Toyota wigo", Me);
    car.showCar();
    }
    
}
