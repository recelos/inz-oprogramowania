import subbusinesstier.Facade;

import java.util.ArrayList;

public class Main {
    public static void main(String t[]) {
        Facade ap = new Facade();
        String t1[] = {"1", "Author1", "Title1", "ISBN1", "Publisher1"}; //1-a iteracja
        String t2[] = {"1", "Author2", "Title2", "ISBN2", "Publisher2"}; //1-a iteracja
        String t3[] = {"1", "Author3", "Title3", "ISBN3", "Publisher3"}; //1-a iteracja
        ap.addBookTitle(t1); //1-a iteracja
        ap.addBookTitle (t2); //1-a iteracja
        ap.addBookTitle (t2); //1-a iteracja
        ap.addBookTitle (t3); //1-a iteracja
        String lan = ap.getBookTitles().toString(); //1-a iteracja
        System.out.println(lan); //1-a iteracja
        String d1[] = {"0", "ISBN1"}; //2-a iteracja
        String d2[] = {"0", "ISBN2"}; //2-a iteracja
        String d3[] = {"0", "ISBN5"}; //2-a iteracja
        String tr1[] = {"0", "1"}; //2-a iteracja
        String tr2[] = {"0", "2"}; //2-a iteracja
        ArrayList<String> pom = ap.addBook(d1, tr1); //2-a iteracja
        if (pom != null) { //2-a iteracja
            System.out.print(pom); } //2-a iteracja
        pom = ap.addBook(d2, tr1); //2-a iteracja
        if (pom != null) { //2-a iteracja
            System.out.print(pom); } //2-a iteracja
        pom = ap.addBook(d2, tr1); //2-a iteracja
        if (pom != null) { //2-a iteracja
            System.out.print(pom);} //2-a iteracja
        pom = ap.addBook(d2, tr2); //2-a iteracja
        if (pom != null) { //2-a iteracja
            System.out.print(pom);} //2-a iteracja
        pom = ap.addBook(d3, tr2); //2-a iteracja
        if (pom != null) { //2-a iteracja
            System.out.print(pom);} //2-a iteracja
        System.out.println(); //2-a iteracja
    } //1-a iteracja
}
