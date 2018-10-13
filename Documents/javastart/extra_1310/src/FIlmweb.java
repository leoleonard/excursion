public class FIlmweb {
    public static void main(String[] args) {
        //zmienna: typ, referencje, przypisanie

        //tworzenie obiektu
        Movie  movie1 = new Movie("Titanic", 1997, "James Cameron", "Dramat");
//        movie1.title = "Titanic";
//        movie1.year = 1997;
//        movie1.director = "James Cameron";
//        movie1.genre = "Dramat";

        movie1.show();
        //wywowalenie metody na obiekcie
    }
}
