package MODULE1;
class Books {
    String title;
    String author;

    Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Books {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class BookOverride {
    public static void main(String[] args) {

        Books b1 = new Books("Java Programming", "James Gosling");
        Books b2 = new Technical("Data Structures", "Mark Allen", "Computer Science");
        Books b3 = new Story("The Alchemist", "Paulo Coelho", "Literature", "Adventure");

        System.out.println("BOOK DETAILS");
        b1.display();

        System.out.println("\nTECHNICAL BOOK DETAILS");
        b2.display();

        System.out.println("\nSTORY BOOK DETAILS");
        b3.display();
    }
}
