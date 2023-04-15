package week6warcardgame;

public class AppofWar {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

      // Instantiate new deck and two players: Xavier & Yair
      DeckofWar deck = new DeckofWar();
      PlayerofWar X = new PlayerofWar("Xavier");
      PlayerofWar Y = new PlayerofWar("Yair");
      
     
      deck.shuffle();
      
      // for loop to iterate through 52 times and alternate drawing of cards 
      for(int i = 0; i < 52; i++) {
        if (i %2 == 0) {
          X.draw(deck);
        } else {
          Y.draw(deck);
        }
      }
      // for loop iterate 26 times and call the flip method
      for(int i = 1; i < 26; i++) {
        CardofWar card1 = X.flip();
        CardofWar card2 = Y.flip();
        int result = card1.getValue()- card2.getValue();
        
        //prints out round plus players names and card names
        System.out.println("Round" + i +" : ");
        System.out.println("------------------------------");
        System.out.println(X.getName() + "'s hand: " + card1.getName());
        System.out.println(Y.getName() + "'s hand: " + card2.getName());
        
        // prints out players names and score and also tabulates running score of player X, Y, and draw of games.
        if (result > 0) {
          System.out.println("   " + X.getName() + " wins this round!");
          X.incrementScore();
          
          System.out.println("------------------------------"); 
          System.out.println("Current Scores Are: ");
          System.out.println("   " + X.getName() + " score: " + X.getScore());
          System.out.println("   " + Y.getName() + " score: " + Y.getScore());
          
      } else if (result < 0) {
        
          System.out.println("   " + Y.getName() + " wins this round!");
          Y.incrementScore();
          
          System.out.println("------------------------------"); 
          System.out.println("Current Scores Are: ");
          System.out.println("   " + X.getName() + " score: " + X.getScore());
          System.out.println("   " + Y.getName() + " score: " + Y.getScore()); 
          
      } else {
          System.out.println("   " + "It's a draw!");
          System.out.println("------------------------------"); 
          System.out.println("Current Scores Are: ");
          System.out.println("   " + X.getName() + " score: " + X.getScore());
          System.out.println("   " + Y.getName() + " score: " + Y.getScore());
      }
      System.out.println("------------------------------");     
      
      
      }
      
      //outputs final tabulated score and name
     int firstScore = X.getScore();
     int secondScore = Y.getScore();
     System.out.println("The final score: ");
     System.out.println(X.getName() + ": " + firstScore);
     System.out.println(Y.getName() + ": " + secondScore);
     
     //outputs the winner or draw with an if-else statement
     if (firstScore > secondScore) {
       System.out.println(X.getName() + "'s is the winner!");
     } else if (secondScore > firstScore) {
       System.out.println(Y.getName() + "'s is the winner!");
     } else {
       System.out.println("No winners: It's a draw.");
     }
         
  } // end of main method         
}   // end of class
