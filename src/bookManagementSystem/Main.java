package bookManagementSystem;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Library library = new Library();

        Author author1 = new Author(1L, "Barış", "Yazman");
        Author author2 = new Author(2L, "Jane", "Doe");
        Author author3 = new Author(3L, "John", "Smith");
        Author author4 = new Author(4L, "Alice", "Johnson");
        Author author5 = new Author(5L, "Michael", "Brown");

        // Kitapları oluştur ve ekle
        Book book1 = new Book(1L, "Peace", author1);
        Book book2 = new Book(2L, "Harmony", author2);
        Book book3 = new Book(3L, "Adventure", author3);
        Book book4 = new Book(4L, "Mystery", author4);
        Book book5 = new Book(5L, "Science", author5);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

           library.sortBooksByDate();
       // library.getBookById(book.getId());

      //  library.removeBook(book.getId());


  //      library.listBooks();
        String foundBookByAuthorName = "Barış12312" ;

         library.findBooksByAuthorName(foundBookByAuthorName) ;



       /* String searchTitle = "Peace";
        Book foundBook = library.findBookByTitle(searchTitle);

        if (foundBook == null) {
            System.out.println("Book is not found : " + foundBook);
        } else {
            System.out.println("Book is found : " + foundBook);
        }*/

    }

}
