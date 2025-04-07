public class Vulpix extends Pokemon{ 

    public Vulpix(){ 
        // uses constructor from pokemon class to create new pokemon 
        super("Vulpix", 38, 41, 40, "Fire", 65, new Move[]{ 
            // creates 4 new moves and adds to Move[] array 
            new Move("Take Down", 9, "Normal", 90), 
            new Move("Fire Blast", 11, "Fire", 80), 
            new Move("Swift", 6, "Normal", 80), 
            new Move("Snarl", 5, "Dark", 70)});
    }
}