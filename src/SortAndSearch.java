import java.util.Scanner;

public class SortAndSearch {
    public String BinarySearch(Book[] books,double price) {

        // tim kiem nhi phan
        int mid;
        int low = 0;
        int hight = books.length - 1;
        while (low <= hight) {
            mid = (low + hight) / 2;
            if (books[mid].getPrice() < price) {
                low = mid + 1;
                if (price < books[low].getPrice()) {
                    return null;
                }
            } else if (books[mid].getPrice() < price) {
                hight = mid - 1;
                if (price > books[hight].getPrice()) {
                    return null;
                }
            } else return books[mid].getName();
        }
       return null;
    }

    // sap xem chon
    public Book[] SelectionSort(Book[] books) {
        int k;
        for (int i = 0; i < 9; i++) {
            k = i;
            for (int j = i + 1; j < 10; j++) {
                if (books[j].getPrice() < books[k].getPrice()) {
                    k = j;
                }
                if (k != i) {
                    Book temp = books[i];
                    books[i] = books[k];
                    books[k] = temp;
                }
            }
        }
        return books;
    }

    //sap xep tren`
    public Book[] InsertSort(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            int j = i;
            while (j > 0 && (books[j].getPrice() < books[j - 1].getPrice())) {
                Book temp = books[j];
                books[j] = books[j-1];
                books[j-1] = temp;
                j--;
            }
        }
        return books;
    }

    //xap sep nho bot
    public Book[] bubbleSort(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        return books;
    }


    //tinh tong tien gia sach
    public double SumPrice(Book[] books) {
        double Sum = 0;
        for (int i = 0; i < books.length; i++) {
            Sum += books[i].getPrice();
        }
        return Sum;
    }


    //dem so sach Java
    public int countJavaBooks(Book[] books) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("java")) {
                count++;
            }
        }
        return count;
    }
}


