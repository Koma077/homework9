package lesson9;

public class Book {

    private final String bookName;
    private final Author authorName;
    private int publicationYear;


    public Book(String bookName, Author authorName, int publicationYear){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }

    public String getBookName(){
        return bookName;
    }

    public Author getFullName(){
        return authorName;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " +
                "Название книги='" + bookName + '\'' +
                ", Имя автора=" + authorName +
                ", Год публикации =" + publicationYear +
                ' ';
    }
}
