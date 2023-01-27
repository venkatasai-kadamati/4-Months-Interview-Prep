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
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.println("*");
      }
      
    }

  }
}
