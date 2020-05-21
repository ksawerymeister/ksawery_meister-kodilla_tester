public class SimpleArray {
    public static void main(String[] args) {

        String[] books = new String[5];

        books[0] = "Limes Inferior";
        books[1] = "Wojna polsko- ruska";
        books[2] = "Vernon Subitex";
        books[3] = "Emigracja";
        books[4] = "Kariera Nikodema- Dyzmy";


        String favBook = books[3];
        System.out.println(favBook);

        int numbersOfElements = books.length;

        System.out.println("Moja tablica zawiera " + books.length + " elementów");


    }

}
