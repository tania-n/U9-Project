public class Charmander extends Pokemon{ 
    
    public Charmander(){ 
        // uses constructor from pokemon class to create new pokemon
        super("Charmander", 39, 52, 43, "Fire", 65, new Move[]{ 
            // creates 4 new moves and adds to Move[] array
            new Move("Scratch", 4, "Normal", 95), 
            new Move("Dragon Breath", 6, "Dragon", 80), 
            new Move("Slash", 7, "Normal", 80), 
            new Move("Flamethrower", 9, "Fire", 100)}); 
    }
    
}