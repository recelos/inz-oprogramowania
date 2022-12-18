import Flight.Model.Airplane;
import Flight.Model.Airport;
import Flight.Model.CrewMember;
import Flight.Model.Flight;
import Flight.Repository.FlightRepository;
import Flight.Service.FlightService;
import Flight.Service.FlightServiceInterface;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class AdminApp{

    private final FlightServiceInterface flightService = new FlightService(new FlightRepository());


    private static void main(String[] args){

    }

    private Flight viewAndPickData(List<Airplane> airplanes, List<CrewMember> crewMembers, List<Airport> airports){
        return null;
    }



    private void addFlight(){
        var date = new Date();

        var availableAirplanes = flightService.getAvailableAirplanes(date);
        var availableAirports = flightService.getAvailableAirports(date);
        var availableCrewMembers = flightService.getAvailableCrewMembers(date);

        var flight = viewAndPickData(availableAirplanes, availableCrewMembers, availableAirports);

        var success = flightService.tryToAddFlight(flight);
    }

}
