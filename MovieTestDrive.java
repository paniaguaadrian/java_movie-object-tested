/**
 * MovieTestDrive
 * We can access to Movie Object so easy and fill the data.
 */
public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Harry Potter";
    one.genre = "Fantasy";
    one.rating = 9.5;
    one.playIt();
  }
}
