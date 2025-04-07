public class Pokemon{
    String name;
    double hp;
    int attack;
    int defense;
    String type;
    Move[] moveList; 
    int speed; 
  
    public Pokemon(String n, double hp, int attack, int defense, String type, int speed, Move[] moves){
      this.name = n;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.type = type;
      this.moveList = moves; 
      this.speed = speed; 
    }
  
    public double getHp(){
      return hp;
    }
  
    public void damage(double amount){
      hp -= amount;
    }
  
    public int getDefense(){
      return defense;
    }
  
    public int getAttack(){
      return attack;
    }
  
    public String getType(){
      return type;
    }
  
    public Move[] getMoveList(){
      return this.moveList;
    }

    // getter for pokemons speed 
    public int getSpeed(){ 
      return this.speed; 
    }

    public int typeAdjustment(){
      return 0;
    } 
  
    public String toString(){
      return this.name;
    }
  }