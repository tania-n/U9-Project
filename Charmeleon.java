public class Charmeleon extends Pokemon{ 
    
    public Charmeleon(){ 
        // uses constructor from pokemon class to create new pokemon
        super("Charmeleon", 58, 64, 58, "Fire", 80, new Move[]{ 
            // creates 4 new moves and adds to Move[] array
            new Move("Take Down", 9, "Normal", 95), 
            new Move("Fire Fang", 6, "Fire", 80), 
            new Move("Shadow Claw", 7, "Ghost", 80), 
            new Move("Thunder Punch", 7, "Electric", 80)});
    }
    
}