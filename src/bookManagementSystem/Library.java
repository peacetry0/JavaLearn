package bookManagementSystem;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Library {

     List<Book> bookList = new ArrayList<>() ;

    public Library() {
        this.bookList = new ArrayList<>();
    }
    public void listBooks(){

        if (bookList.isEmpty()){
            System.out.println("No BOOKS");
        }else{
            bookList.forEach(System.out::println);

        }

    }
    public void getBookById(Long id){

        bookList.stream()
                .filter(book -> book.getId() != null && book.getId()
                        .equals(id))
                .findFirst()
                .ifPresentOrElse(book -> {
                    System.out.println("Found Book ::" + book);
                },() ->{
                    System.out.println("Book not found by id : " + id);
                });
    }
    public void addBook(Book book){

        bookList.add(book) ;
        System.out.println("Book is added : " + book);

    }
    public void removeBook(Long id) {

        Optional<Book> bookToRemove = bookList.stream()
                .filter(book -> book.getId() != null && book.getId().equals(id))
                .findFirst();

        bookToRemove.ifPresentOrElse(book -> {
            bookList.remove(book);
            System.out.println("Book is deleted: ID = " + id);
        }, () -> {
            System.out.println("Book ID " + id + " not found  ID.");
        });
    }
    public Book findBookByTitle(String title){
        return bookList.stream()
                .filter(book -> book.getTitle()
                        .equalsIgnoreCase(title))
                .findFirst()
                .orElse(null) ;

    }
    public List<Book> findBooksByAuthorName(String authorName){

        List<Book> findBooksByAuthorName = bookList
                .stream()
                .filter(book -> book.getAuthor() != null &&
                        book.getAuthor().getName().equalsIgnoreCase(authorName))
                .collect(Collectors.toList());

        if (findBooksByAuthorName.isEmpty()){
            System.out.println("Not books by author : " + authorName);
        }else {
            findBooksByAuthorName.forEach(System.out::println);
        }

        return findBooksByAuthorName ;
    }
    public void sortBooksByDate(){
        bookList.sort(Comparator.comparing(Book::getCreatedAt).reversed());
        System.out.println("Book Sorted By Creadition date(new)");
        listBooks();
    }

}
