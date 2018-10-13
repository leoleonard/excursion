public class FIlmweb {
    public static void main(String[] args) {
        //zmienna: typ, referencje, przypisanie
//        String title1 = "Titanic";
//        int year = 1997;
//        String genre = "Dramat";
//        String director = "James Cameron";
        //nizej:::

        //tworzenie obiektu
        Movie  movie1 = new Movie();
        movie1.title = "Titanic";
        movie1.year = 1997;
        movie1.director = "James Cameron";
        movie1.genre = "Dramat";

        //System.out.println(title1 + " " + director + " " + genre + " " + year);
       // System.out.printf("%s %s %s %d", movie1.title, director, genre, year);
        //::przeniesienie do Movie jako metoda
    }
}
