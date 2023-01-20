public class weapon { 

    String name; 
    long damage; 
    String rarity; 

    public void WeaponName() {
        System.out.println("Weapon name: " + name);

    }
            public void WeaponDamage() {
                System.out.println("damage: " + damage);
        }
        
            public void WeaponRarity() {
                System.out.println("rarity: " + rarity);
        }

    public void AddDamage(int additionalDamage){
        long newDamage = this.damage + additionalDamage; 

        System.out.println("Damage increased from " +  damage + " to " + newDamage);

        this.damage = newDamage;
}

public String showNameandrarity() {
    return this.name + " " +this.rarity; 
}
    
}
