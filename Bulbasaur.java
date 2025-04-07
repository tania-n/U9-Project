public class Bulbasaur extends Pokemon{
  
    public Bulbasaur(){
      super("Bulbasaur", 50, 10, 15, "Grass", 45, new Move[] {
                      new Move("tackle", 8, "Normal", 90), 
                      new Move("tail whip", 0, "Normal", 75),
                      new Move("vine whip", 10, "Grass", 75),
                      new Move("bite", 10, "Normal", 80)});
    }
  
  }