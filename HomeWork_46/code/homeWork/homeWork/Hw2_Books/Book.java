package homeWork.homeWork.Hw2_Books;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int isbn;
    private String author;
    private String name;
    private int year;
    private int capacity;

    public Book(int isbn, String author, String name, int year, int capacity) {
        this.isbn = isbn;
        this.author = author;
        this.name = name;
        this.year = year;
        this.capacity = capacity;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public int compareTo(Book o) {
        int res = this.author.compareTo(o.author);
        return res !=0 ? res: Integer.compare(this.isbn, o.isbn);
    }
}
