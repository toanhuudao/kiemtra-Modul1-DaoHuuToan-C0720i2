import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {

        Book[] books = new Book[10];
        books[0] = new ProgrammingBook(1, "javang", 1000.0, "A", "java", "Spring");
        books[1] = new ProgrammingBook(1, "javat", 210.3, "B", "java", "Summer");
        books[2] = new ProgrammingBook(1, "java", 600.3, "C", "java", "Autumn");
        books[3] = new ProgrammingBook(1, "javan", 200.4, "D", "java", "Winter");
        books[4] = new ProgrammingBook(1, "java", 400.4, "A", "java", "HappyNewYear");

        books[5] = new FictionBook(2, "php1", 600.1, "B", "truyen cuoi");
        books[6] = new FictionBook(2, "php2", 800.2, "C", "truyen vui");
        books[7] = new FictionBook(2, "php3", 200.8, "B", "truyen trinh tham");
        books[8] = new FictionBook(2, "php4", 900.4, "K", "truyen co tich");
        books[9] = new FictionBook(2, "php5", 600.7, "T", "truyen vui");


        SortAndSearch sortAndSearch = new SortAndSearch();
//        double x = sortAndSearch.SumPrice(books);
        String y = sortAndSearch.BinarySearch(books, 900.22);
//        Book[] z = sortAndSearch.bubbleSort(books);
//        Book[] n = sortAndSearch.SelectionSort(books);
//        int p = sortAndSearch.countJavaBooks(books);
//        Book[] h = sortAndSearch.InsertSort(books);
//
        System.out.println(y);




    }
}


