package Flight.Model;

import java.util.Date;

public abstract class Person {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected Date birthDate;
    protected char gender;

    protected Person(int id, String firstName, String lastName, Date birthDate, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() { return id; }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getGender() {
        return gender;
    }
}
