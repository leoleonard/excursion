public class Movie {

    //pola - specyfikator dostepu, typ, nazwa

    String title;
    int year;
    String director;
    String genre;

    //metody

    void show() {
        System.out.printf("%s %s %s %d", title, director, genre, year);
    }
    //konstruktory


}
