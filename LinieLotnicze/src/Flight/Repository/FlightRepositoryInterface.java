package Flight.Repository;

import Flight.Model.*;

import java.util.List;

public interface FlightRepositoryInterface {
    List<Flight> getFlights();

    List<Airport> getAirports();

    List<CrewMember> getCrewMembers();

    List<Airplane> getAirplanes();

    void createNewFlight(Flight flight);

    void addNewAirport(Airport airport);

    void addNewAirplane(Airplane airplane);
}
