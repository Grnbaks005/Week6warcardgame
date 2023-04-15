package week6warcardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckofWar {

  // declare field
  List<CardofWar> Cards = new ArrayList<CardofWar>();
  
  // declare constructor
  public DeckofWar() {
    this.Cards = new ArrayList<>();
    String[] numbers = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "JACK", "QUEEN", "KING", "ACE"};  
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    
    // enhanced for loop constructor
    for (String suit: suits) {
      int count = 2; // counter to set value of 2 and will through index of numbers 2-Ace
        for(String number: numbers) {
        // bottom line will create our deck
        CardofWar Cards = new CardofWar(number, suit, count);
        this.Cards.add(Cards);
        count++;
      }
    }
  }
  
  //declare method
    public void shuffle() {
      Collections.shuffle(Cards);
      
    }
    public CardofWar draw() {
      return Cards.remove(0);
    }     
    
  

  
}// end of class
