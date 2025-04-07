public class Pidgey extends Pokemon{
    public Pidgey(){
        super("Pidgey", 40, 10, 15, "Flying", 56, new Move[] {
                        new Move("tackle", 8, "Normal", 90), 
                        new Move("gust", 10, "Flying", 75),
                        new Move("sand attack", 0, "Ground", 85),
                        new Move("quick attack", 4, "Normal", 85)});
      }
    }