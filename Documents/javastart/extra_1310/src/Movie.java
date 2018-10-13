public class Movie {

    //pola - specyfikator dostepu, typ, nazwa

    String title;
    int year;
    String director;
    String genre;


    //konstruktory
    //:::utworzenie konstruktora nie(!) domyslnego

    public Movie(String title, int year, String director, String genre) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.genre = genre;
    }

    //metody

    void show() {
        System.out.printf("%s %s %s %d", title, director, genre, year);
    }


}
