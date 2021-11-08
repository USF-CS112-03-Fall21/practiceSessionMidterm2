// Note: this class Movie is unrelated to project 3
public class Movie { // Add code so that Movie implements Storable, Comparable and Iterable
    private String title; // title of the movie
    private double rating; // rating of the movie from 1.0 to 10.0
    // add another instance variable - a list of cast members (can be stored as an ArrayList of String-s)

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
        // FILL IN CODE: initialize the ArrayList of cast members here
    }

    public void addCastMember(String castMember) {
        // FILL IN CODE: should add a new cast member to the "cast" list
    }


    // FILL IN CODE
    /* A movie has a title, a rating, and a list of cast members (you need to add the latter to the class).
     Note that class Movie is unrelated to project 3.

      - Fill in the code in the addCastMember method that adds the name of a particular cast member to the list

    - Consider the interface Storable, that has the method writeToFile that takes a filename as a parameter.
    The idea is that classes that implement Storable provide a way to write an object of the class to a file.

    Class Movie must implement Storable. It should write information about this movie to a file in the following format:

    title

    rating

    list of cast members (one cast member name per line)


    For example:

    Interstellar

    8.6

    Matthew McConaughey
    Anne Hathaway
    Ellen Burstyn
    Jessica Chastain

    My apologies for listing only 4 cast members here to save space - the movie has quite a few great ones.

    Use the PrintWriter (and the method println() of the PrintWriter class) to write info to the file.

    Note: You are required to catch IOException inside the writeToFile method.


- Class Movie should also implement Comparable and compare movies based on the rating (this movie is "less than" the other movie, if its rating is smaller).

- Finally, class Movie should also implement Iterable<String> interface so that it returns an iterator for the list of cast members (hint: no need to write your own iterator - take advantage of the fact that class ArrayList implements Iterable so has an iterator).
   */


}
