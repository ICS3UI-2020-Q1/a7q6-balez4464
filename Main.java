/**
 *This program returns true if all the digits are odd but returns false if there are any even numbers
 * @author Zachary Balean
 */
public class Main {

  //Methhos for all the odd digits
  public static boolean allDigitsOdd(int number){
    //integer for figuring out if it is odd or even
    int remainder = 0;
    //while loop to go through the digitsg
    while(number >= 1){
      //calcualtes the digit number
      remainder = number % 10;
      //goes on to the next digit of the nuber
      number = number / 10;
      //if statement to return false if even
      if(remainder % 2 == 0){
        return false;
      } 
  }
    //return true if odd
    return true;
}

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // calls the method
    boolean answer = allDigitsOdd(135319);
    //prints out answer
    System.out.println(answer);
  }
}
