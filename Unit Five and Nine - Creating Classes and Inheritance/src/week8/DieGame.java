package week8;

public class DieGame {
   // attributes - defines the state of he Object

   // The attributes SHOULD be private
   // private -> visible(accessable) in this class
   private int numSides;
   private int topSide;

   // constructor
   // has the same name as the class
   // you should create at least 1
   // they are used to obtain (contruct an instance of this class)
   // In this case it will give a Die
   // Pursose is to initialise the state (attributes)
   public DieGame() {
      /* constructor initialises the attributes */
      numSides = 6;
      roll();
   }

   public DieGame(int numSides) {
      /* The word this referes to the Object that we are working with. */
      // The object the called the method.
      this.numSides = numSides;
      roll();
   }

   public void roll() {
      topSide = (int) (Math.random() * numSides) + 1;
   }

   public int getTopSide() {
      return topSide;
   }
}