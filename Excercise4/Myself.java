public class Myself {

    String name;
    int age; 
    
    Myself (String MyselfName, int MyselfAge) {
        this.age = MyselfAge; 
        this.name = MyselfName;
    
      }
      void addFriend(Person friend){
        System.out.println(" kaibigan ko si " + friend.name);
      }
}
