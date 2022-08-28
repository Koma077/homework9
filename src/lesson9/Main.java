package lesson9;

public class Main {

    public static void main(String[] args) {
        var author1 = new Author("Альберт", "Камю");
        var author2 = new Author("Франц","Кафка");
        var book1 = new Book("Посторонний", author1, 1942);
        var book2 = new Book("Процесс", author2, 1925);
        book1.setPublicationYear(1999);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);



    }
}
