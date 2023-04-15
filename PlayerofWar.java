package week6warcardgame;

import java.util.ArrayList;
import java.util.List;

public class PlayerofWar {
  
  // declare fields
  private List<CardofWar> hand = new ArrayList<>();
  private int score;
  private String name;
  
  public PlayerofWar (String name) {
    this.hand = new ArrayList<>();
    this.score = 0; 
    this.name = name; 
  }
  
  
  // declare getters and setters
  public List<CardofWar> getHand() {
    return hand; 
  }
  
  public void setHand(List<CardofWar> hand) {
  }
  
  public int getScore() {
    return score;
  }
  
  public void setScore(int score) {
    this.score = score;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

    // declare methods
  
  public CardofWar flip() {
    return this.hand.remove(0);
  }
  
  public void draw(DeckofWar deck) {
    this.hand.add(deck.draw());
  }
  
  
  public void incrementScore() {
    this.score++; 
  }
  
  
  public void drawHand() {
    return; 
  }
  
  
}// end of class
  