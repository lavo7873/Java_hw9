public class Main {
      // generic method to display value
      public static <T> void printAnything(T anyObject) {
            // display on the screen
            System.out.println(anyObject);
      }
 
      public static void main(String[] args) {
            // method calling
            printAnything(10);
            printAnything(2.5);
            printAnything("Hello");
      }
}

