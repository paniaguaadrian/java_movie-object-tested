/**
 * Movie
 * Creating our first object and use it in another class
 */
public class Movie {

  String title;
  String genre;
  double rating;

  void playIt() {
    System.out.println("Playing the movie: " + title + " - " + genre + " => " + rating + " rating.");
  }
}
