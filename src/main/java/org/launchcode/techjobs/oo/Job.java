package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //  Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //  Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString(){
        //Integer ID = this.getId();
        String name = this.getName();
        String verifiedName;
        String employer = this.getEmployer().getValue();
        String verifiedEmployer;
        String location = this.getLocation().getValue();
        String verifiedLocation;
        String positionType = this.getPositionType().getValue();
        String verifiedPositionType;
        String coreCompetency = this.getCoreCompetency().getValue();
        String verifiedCoreCompetency;

        if (name.isEmpty()){
            verifiedName = "Data not available";
        } else {
            verifiedName = name;
        }
        if (employer == null || employer.equals("")){
            verifiedEmployer = "Data not available";
        } else {
            verifiedEmployer = employer;
        }
        if (location == null || location.equals("")){
            verifiedLocation = "Data not available";
        } else {
            verifiedLocation = location;
        }
        if (positionType == null || positionType.equals("")){
            verifiedPositionType = "Data not available";
        } else {
            verifiedPositionType = positionType;
        }
        if (coreCompetency == null || coreCompetency.equals("")){
            verifiedCoreCompetency = "Data not available";
        } else {
            verifiedCoreCompetency = coreCompetency;
        }


        return "\n" +
                "ID: " + this.getId() + "\n" +
                "Name: " + verifiedName + "\n" +
                "Employer: " + verifiedEmployer + "\n" +
                "Location: " + verifiedLocation + "\n" +
                "Position Type: " + verifiedPositionType + "\n" +
                "Core Competency: " + verifiedCoreCompetency + "\n" +
                "\n";
    }


    //  Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
