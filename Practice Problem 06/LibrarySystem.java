
class Books {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearOfPub;
    double price;
    String status;

    void addNewBooks() {
        System.out.println("New book added.");
    }

    void deleteBooks() {
        System.out.println("Book deleted.");
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Year of Publication: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    void inquiryBook() {
        System.out.println("Book inquiry completed.");
    }
}

class Librarian {
    int id;
    String name;

    void searchBook(String bookName) {
        System.out.println("Searching for book: " + bookName);
    }

    boolean verifyMember(int userId) {
        return true;
    }

    void orderBooks() {
        System.out.println("Book ordered from publisher.");
    }

    void sellBooks() {
        System.out.println("Book sold to user.");
    }
}

class Publisher {
    int id;
    String name;
    String address;
    long phoneNo;

    void addPub() {
        System.out.println("Publisher added.");
    }

    void modifyPub() {
        System.out.println("Publisher modified.");
    }

    void deletePub() {
        System.out.println("Publisher deleted.");
    }

    void orderStatus() {
        System.out.println("Order status checked.");
    }
}

class User {
    int userId;
    String userName;
    String userAddress;
    long phoneNo;

    void returnBooks() {
        System.out.println("Book returned.");
    }

    double payFine(int daysLate) {
        double fine = daysLate * 10;
        return fine;
    }

    void addNewUser() {
        System.out.println("New user added.");
    }

    void deleteUser() {
        System.out.println("User deleted.");
    }

    void updateDetails() {
        System.out.println("User details updated.");
    }

    void bookPurchase() {
        System.out.println("Book purchased.");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Books b1 = new Books();
        b1.bookId = 101;
        b1.bookName = "Java Programming";
        b1.bookAuthor = "Herbert Schildt";
        b1.yearOfPub = "2020";
        b1.price = 550;
        b1.status = "Available";

        Librarian l1 = new Librarian();
        l1.id = 1;
        l1.name = "Mr. Karim";

        Publisher p1 = new Publisher();
        p1.id = 201;
        p1.name = "Tech Publisher";
        p1.address = "Dhaka";
        p1.phoneNo = 123456789;

        User u1 = new User();
        u1.userId = 301;
        u1.userName = "Nahid";
        u1.userAddress = "Sylhet";
        u1.phoneNo = 987654321;

        b1.displayBookDetails();

        l1.searchBook("Java Programming");

        if (l1.verifyMember(u1.userId)) {
            u1.bookPurchase();
            l1.sellBooks();
        } else {
            System.out.println("User is not a valid member.");
        }

        double fineAmount = u1.payFine(5);
        System.out.println("Fine Amount: " + fineAmount);

        u1.returnBooks();
        l1.orderBooks();
        p1.orderStatus();
    }
}