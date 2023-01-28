package Patterns.Codes;


// ? Pattern2 : 
/* 
*
* *
* * *
* * * *  
* * *  
* *  
* 
*/
public class Star_Pattern2 {
  public static void main(String[] args) {
    int rows = 4;

    // ! Upward Half-right triangle
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    // ! Downward Half-right triangle
    for (int i = rows - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }

}
