public class Move{
    String name;
    int power;
    String type; 
    int accuracy; 
    
    public Move(String n, int p, String t, int a){
      this.name = n;
      this.power = p;
      this.type = t; 
      this.accuracy = a; 
    }
  
    public int getPower(){
      System.out.println(this.name + "!");
      return this.power;
    } 

    // getter for accuracy 
    public int getAccuracy(){ 
      return this.accuracy; 
    } 
    
    public String toString(){
      return this.name;
    }
  }