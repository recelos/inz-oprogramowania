package Flight.Model;

import java.util.Date;

public class CrewMember extends Person {
    private CrewMemberType crewMemberType;

    protected CrewMember(int id, String firstName, String lastName, Date birthDate, char gender) {
        super(id, firstName, lastName, birthDate, gender);
    }

    public CrewMemberType getCrewMemberType(){
        return crewMemberType;
    }
}
