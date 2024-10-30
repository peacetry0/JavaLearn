package bookManagementSystem;

import java.util.Objects;

public class Book extends BaseEntity {

      private String title ;
      private Author author ;

      public Book(Long id , String title, Author author) {
            setId(id);
            this.title = title;
            this.author = author;
      }

      public String getTitle() {
            return title;
      }

      public void setTitle(String title) {
            this.title = title;
      }

      public Author getAuthor() {
            return author;
      }

      public void setAuthor(Author author) {
            this.author = author;
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(title, book.title) && Objects.equals(author, book.author);
      }

      @Override
      public int hashCode() {
            return Objects.hash(title, author);
      }

      @Override
      public String toString() {
            return super.toString() + "Book{" +
                    ", id=" + getId() +
                    "title='" + title + '\'' +
                    ", author=" + author +
                    '}';
      }
}
