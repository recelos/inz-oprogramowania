package Flight.Model;

import java.util.Date;
import java.util.List;

public class Flight {
    private final int id;
    private final Airplane airplane;
    private final FlightStatus status;
    private final List<Passenger> passengers;
    private final List<CrewMember> crewMembers;
    private final Airport origin;
    private final Airport destination;
    private final Date departure;
    private final Date arrival;

    public Flight(int id,
                  Airplane airplane,
                  FlightStatus status,
                  List<Passenger> passengers,
                  List<CrewMember> crewMembers,
                  Airport origin, Airport destination,
                  Date departure,
                  Date arrival) {
        this.id = id;
        this.airplane = airplane;
        this.status = status;
        this.passengers = passengers;
        this.crewMembers = crewMembers;
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getId() {
        return id;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public Date getDeparture() {
        return departure;
    }

    public Date getArrival() {
        return arrival;
    }
}
