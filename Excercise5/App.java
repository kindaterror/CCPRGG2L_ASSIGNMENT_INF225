public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Onag");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        Me.setnum (12345); 

        int myCCnumber = Me.getnum(); 

        System.out.println("my cc number is " + myCCnumber);


        Son me = new Son();

        System.out.println(" my family name is: " + me.surname);

        me.showLove();
    }
}
