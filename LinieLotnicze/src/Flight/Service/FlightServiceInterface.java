package Flight.Service;
import Flight.Model.*;

import java.util.Date;
import java.util.List;
public interface FlightServiceInterface{

    List<Flight> getAllFlights();

    List<Airport> getAvailableAirports(Date date);

    List<CrewMember> getAvailableCrewMembers(Date date);

    List<Airplane> getAvailableAirplanes(Date date);

    boolean tryToAddFlight(Flight flight);
}