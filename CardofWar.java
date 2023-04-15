package week6warcardgame;

public class CardofWar {
  
  // declare fields
   private String name; 
   private String suit;
   private int value;
  
  
  //declare constructor
  public CardofWar(String name,String suit, int value) {
    this.value = value;
    this.name = name; 
    this.suit = suit;
  }


  // declaring getters and setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
  
  public String getSuit() {
    return suit;
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  // declaring describe method
  public void describe() {
    System.out.println();
  }
  
  
}// end of class
