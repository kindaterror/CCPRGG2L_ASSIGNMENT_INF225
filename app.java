public class App {
    public static void main(String[] args) {


        
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.Attack();



        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.Attack();



        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.Attack();



        weapon Spear = new weapon(); 
        Spear.name = "Gungnir"; 
        Spear.damage =  1000000000 ; 
        Spear.rarity = "SSR"; 
        Spear.WeaponName();
        Spear.WeaponDamage();
        Spear.WeaponRarity(); 
        Spear.AddDamage(50065140);
        System.out.println(Spear.showNameandrarity());



        Character Berzerker = new Character();  
        Berzerker.name = "Kratos"; 
        Berzerker.sayMyName();
        Berzerker.Attack();
    }
}
