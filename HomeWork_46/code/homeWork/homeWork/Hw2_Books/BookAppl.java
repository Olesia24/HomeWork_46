package homeWork.homeWork.Hw2_Books;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookAppl {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(9234, "Gustave Flaubert", "Madame Bovary", 1856, 140));
        bookList.add(new Book(4321, "Leo Tolstoy", "War and Peace", 1869, 44));
        bookList.add(new Book(2345, "Homer", "Odyssey", 1614,43));
        bookList.add(new Book(5432, "Vladimir Nabokov", "Lolita", 1955, 65));
        bookList.add(new Book(6789, "Fyodor Dostoyevsky", "The Brothers Karamazov", 1880, 100));

        System.out.println("Size: " + bookList.size());
        System.out.println("Book list is Empty: " + bookList.isEmpty());
        for (Book b: bookList) {//print
            System.out.println(b);
        }
        System.out.println("---------------------------------------");
        bookList.sort(Book::compareTo); //sorting by name
        for (Book b : bookList) {
            System.out.println(b);
        }
        int totalCapacity = 0;
        for (Book b : bookList) {
            totalCapacity += b.getCapacity();
        }
        System.out.println("Total capacity: " + totalCapacity);
        System.out.println("-----------------------------------------");

        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getCapacity()- o2.getCapacity();
            }
        };
        bookList.sort(comparator);
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
