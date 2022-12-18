package Flight.Repository;

import java.util.ArrayList;
import java.util.List;

import Flight.Model.*;

public class FlightRepository implements FlightRepositoryInterface{
    @Override
    public List<Flight> getFlights() {
        new DbConnector().getConnection(null);
        return new ArrayList<>();
    }

    @Override
    public List<Airport> getAirports() {
        new DbConnector().getConnection(null);
        return null;
    }

    @Override
    public List<CrewMember> getCrewMembers() {
        new DbConnector().getConnection(null);
        return null;
    }

    @Override
    public List<Airplane> getAirplanes() {
        new DbConnector().getConnection(null);
        return null;
    }

    @Override
    public void createNewFlight(Flight flight) {
        new DbConnector().getConnection(null);
    }

    @Override
    public void addNewAirport(Airport airport) {
        new DbConnector().getConnection(null);
    }

    @Override
    public void addNewAirplane(Airplane airplane) {
        new DbConnector().getConnection(null);
    }
}
