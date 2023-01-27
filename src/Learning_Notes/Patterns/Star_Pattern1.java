package Learning_Notes.Patterns;

// ? Pattern1 : 
/* 
*
* *
* * *
* * * *  
*/

public class Star_Pattern1 {
  public static void main(String[] args) {
    int rows = 4;

    // ! Upward Half-right triangle
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("-----------");

    // ! Downward Half-right triangle
    for (int i = rows; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}
