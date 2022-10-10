package subbusinesstier.entities;
public class Book {
    private int number; //1-a iteracja
    private BookTitle bookTitle; //1-a iteracja

    public Book() {
    }

    public int getNumber() { //2-a iteracja
        return number;
    }

    public void setNumber(int number) { //2-a iteracja
        this.number = number;
    }

    public BookTitle getBookTitle() { //2-a iteracja
        return bookTitle;
    }

    public void setBookTitle(BookTitle booktitle) { //2-a iteracja
        this.bookTitle = booktitle;
    }

    @Override
    public int hashCode() { //2-a iteracja
        int hash = 0;
        hash += (number != 0 ? number : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) { //2-a iteracja
        return number == ((Book) obj).getNumber();
    }

    @Override
    public String toString() // your code here
    {
        String bookdata = bookTitle.toString();
        bookdata += " Number: " + getNumber();
        return bookdata;
    }
}