package Flight.Service;

import Flight.Model.Airplane;
import Flight.Model.Airport;
import Flight.Model.CrewMember;
import Flight.Model.Flight;
import Flight.Repository.FlightRepositoryInterface;

import java.util.Date;
import java.util.List;

public class FlightService implements FlightServiceInterface {
    private final FlightRepositoryInterface flightRepository;

    public FlightService(FlightRepositoryInterface flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights(){
        return flightRepository.getFlights();
    }

    public List<Airplane> getAvailableAirplanes(Date date){
        var airplanes = flightRepository.getAirplanes();

        return searchForAvailablePlanes(airplanes, date);
    }

    public List<Airport> getAvailableAirports(Date date){
        var airports = flightRepository.getAirports();

        return searchForAvailableAirports(airports, date);
    }

    public List<CrewMember> getAvailableCrewMembers(Date date){
        var crewMembers = flightRepository.getCrewMembers();

        return searchForAvailableCrewMembers(crewMembers, date);
    }

    public boolean tryToAddFlight(Flight flight){
        var validation = validateFlight(flight);

        if(validation){
            flightRepository.createNewFlight(flight);
        }
        return validation;
    }

    private List<Airplane> searchForAvailablePlanes(List<Airplane> airplanes, Date date) {
        return null;
    }

    private List<Airport> searchForAvailableAirports(List<Airport> airports, Date date) {
        return null;
    }

    private List<CrewMember> searchForAvailableCrewMembers(List<CrewMember> crewMembers, Date date) {
        return null;
    }

    private boolean validateFlight(Flight flight){
        return true;
    }
}
