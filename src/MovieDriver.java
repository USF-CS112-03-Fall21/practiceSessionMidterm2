public class MovieDriver {
    public static void main(String[] args) {
        Movie movie1 = new Movie ("Interstellar", 8.6);
        movie1.addCastMember("Matthew McConaughey");
        movie1.addCastMember("Anne Hathaway");
        movie1.addCastMember("Ellen Burstyn");
        movie1.addCastMember("Jessica Chastain");

        // Uncomment once you implement Iterable in Movie
        /* for (String castMember: movie1) {
            System.out.println(castMember);
        } */

        // Uncomment once you implement Storable in Movie
        // movie1.writeToFile("movie1Info.txt");

        Movie movie2 = new Movie ("The Martian", 9.1);
        movie2.addCastMember("Matt Damon");
        movie2.addCastMember("Jessica Chastain");
        movie2.addCastMember("Chiwetel Ejiofor");
        movie2.addCastMember("Kristen Wiig");
        movie2.addCastMember( "Jeff Daniels");

        // Uncomment once you implement Comparable in Movie
        //System.out.println(movie1.compareTo(movie2));

    }
}
