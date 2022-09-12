/*
 * Labb 1 asignment 
 */
package fizzbuzz;

public class App {
    public static void main(String[] args) {
      for (int i = 0; i <= 100; i++) {
  
        if(i == 42) {
          System.out.println("Answer to the Ultimate Question of Life, the Universe, andEverything");
        }
        else if (i % 3 == 0 && i % 5 == 0) {
          System.out.println("index: " + i  + " :fizzbuzz");
        } 
        else if (i % 3 == 0) {
          System.out.println("index: " + i + " :fizz");
        } 
        else if (i % 5 == 0) {
          System.out.println("index: " + i + " :buzz");
        } 
        else {
          System.out.println("index: " + i);
        }
       }
    }
}
