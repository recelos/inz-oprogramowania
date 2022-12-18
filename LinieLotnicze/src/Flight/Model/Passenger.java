package Flight.Model;

import java.util.Date;

public class Passenger extends Person {
    private int seat;
    private Luggage luggage;

    protected Passenger(int id, String firstName, String lastName, Date birthDate, char gender) {
        super(id, firstName, lastName, birthDate, gender);
    }
}
