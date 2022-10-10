package subbusinesstier;
import java.util.ArrayList;
import java.util.List;
import subbusinesstier.entities.BookTitle;
import subbusinesstier.entities.BookTitle;

public class Facade {
    List<BookTitle> bookTitles;

    public Facade() { //1-a iteracja
        bookTitles = new ArrayList<>();
    }

    public List<BookTitle> getBookTitles() { //1-a iteracja
        return bookTitles;
    }

    void setBookTitles(List<BookTitle> booktitles) { //1-a iteracja
        bookTitles = booktitles;
    }

    public BookTitle findBookTitle(BookTitle booktitle) { //1-a iteracja
        int idx;
        if ((idx = bookTitles.indexOf(booktitle)) != -1) {
            booktitle = bookTitles.get(idx);
            return booktitle;
        }
        return null;
    }

    public String addBookTitle(String data[]) { //1-a iteracja
        Factory factory = new Factory();
        BookTitle newbooktitle = factory.createBookTitle(data);
        BookTitle result = findBookTitle(newbooktitle);
        if (result == null) {
            bookTitles.add(newbooktitle);
            String info = newbooktitle.toString();
            return info;
        }
        return null;
    }

    public ArrayList<String> addBook(String data1[], String data2[]) { //2-a iteracja
        BookTitle booktitleexist, searchpattern;
        Factory fabryka = new Factory();
        searchpattern = fabryka.createBookTitle(data1);
        if ((booktitleexist = findBookTitle(searchpattern)) != null) {
            return booktitleexist.addBook(data2);
        }
        return null;
    }
}