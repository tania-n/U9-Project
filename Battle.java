import java.util.*;
public class Battle{
  Pokemon p1;
  Pokemon p2;

  public Battle(Pokemon p1, Pokemon p2){
    this.p1 = p1;
    this.p2 = p2;
  }

  public Move moveChoice(Pokemon p){
    Scanner input = new Scanner(System.in);
    System.out.println("Choose a move:");
    int i = 1;
    for(Move move:p.getMoveList()){
      System.out.println(i + ": " + move);
      i++;
    }
    int choice = input.nextInt();
    if(choice == 1){
      return p.getMoveList()[0];
    }
    else if(choice == 2){
      return p.getMoveList()[1];
    }
    else if(choice == 3){
      return p.getMoveList()[2];
    }
    else{
      return p.getMoveList()[3];
    }
  } 

  public boolean isAccurate(int accuracy){  
    // generates a random number between 0 and 100 
    int random = (int)(Math.random() * 101); 
    // if the number is less than the number for accuracy, returns true 
    if(random < accuracy){ 
      return true; 
    } 
    return false; 
  }

  public double critical(double power){ 
    // generates random number between 1 and 4 
    int random = (int)(Math.random() * 4) + 1; 
    double chance = 0.0; 
    double damage = power; 
    // if random is 1, chance changes to 6.25 
    if(random == 1){ 
      chance = 6.25; 
    } 
    // if random is 2, chance changes to 12.5
    else if(random == 2){ 
      chance = 12.5; 
    } 
    // if random is 3, chance changes to 25.0 
    else if(random == 3){ 
      chance = 25.0; 
    } 
    // if random is 4, chance changes to 50.0 
    else{ 
      chance = 50.0; 
    } 

    // generates another random number between 0 and 100 
    int random1 = (int)(Math.random() * 101); 

    // if random number is less than chance, power gets multiplied by 1.5 
    if(random1 < chance){ 
      damage = power * 1.5; 
    }

    return damage; 
  }

  public double damageType(Pokemon a, Pokemon b){  
    String aType = a.getType(); 
    String attacker = b.getType(); 
    String[] types = {"fire", "flying", "grass"}; 
    double damage = 0.0; 
    // adds all the damage types to 2d array in order of types in types array 
    double[][] damageTypes = {{0.5, 1, 0.5}, {1, 1, 0.5}, {0.5, 2, 2}};  
    int a1 = 0; 
    int b1 = 0; 

    // loops through types[] 
    for(int i = 0; i < types.length; i++){ 
      // checks if the type at index i is equal to aType 
      if(aType.toLowerCase().equals(types[i])){
        a1 = i; 
      } 
      // checks if the type at index is equal to attacker 
      if(attacker.toLowerCase().equals(types[i])){ 
        b1 = i; 
      }
    }

    // saves the damage type in row a1, columb b1 
    damage = damageTypes[a1][b1]; 
    return damage; 
  }

  public void turn(Pokemon a, Pokemon b){
    System.out.println(a + "'s turn!");
        Move move = moveChoice(a);
        int power = move.getPower(); 
        int accuracy = move.getAccuracy(); 
        double damage = (int)(power * ((double)a.getAttack()) / b.getDefense()); 
        damage = critical(damage); 
        damage = damageType(a, b) * damage; 
        // if the hit is accurate, then the pokemon takes damage 
        if(isAccurate(accuracy) == true){ 
          System.out.println(b + " took " + damage + " damage."); 
          b.damage(damage); 
        } 
        // if not, the game will say the pokemon missed 
        else{ 
          damage = 0;  
          System.out.println(a + " missed!");
        }
        System.out.println(b + " has " + Math.max(b.getHp(), 0) + " hit points left."); 
  }

  public void start(){
    System.out.println("A wild " + p2 + " has appeared! I choose you, " + p1);
    int turn = 0; 
    int temp = 0;  
    // if p1 has a greater speed, it will go first 
    // temp changes to 2 
    if(p1.getSpeed() > p2.getSpeed()){ 
      turn(p1, p2); 
      temp = 2; 
    } 
    // if not, p2 will go first instead 
    // temp changes to 3 
    else{ 
      turn(p2, p1); 
      temp = 3; 
    }
    turn++; 
    // repeats while both pokemon have hp  
    while(p1.getHp() > 0 && p2.getHp() > 0){
      // if temp is 2, it will be p2's turn 
      // temp will change to 3 
      if(temp == 2){ 
        turn(p2, p1); 
        temp = 3; 
      } 
      // if temp is 3, it will be p1's turn 
      // temp will change to 2 
      else if(temp == 3){ 
        turn(p1, p2); 
        temp = 2; 
      }
      turn++;
    }
    if(p1.getHp() <= 0){
        System.out.println(p1 + " fainted! " + p2 + " wins!");
    }
    else{
      System.out.println(p2 + " fainted! " + p1 + " wins!");
    }
  }
}