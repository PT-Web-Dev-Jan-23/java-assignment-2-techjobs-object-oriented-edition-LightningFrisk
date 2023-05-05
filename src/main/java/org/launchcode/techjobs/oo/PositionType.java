package org.launchcode.techjobs.oo;

public class PositionType extends JobField {
    private String value;

    public PositionType(String value) {this.value = value;}

    //  Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return value;
    }

    //  Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }

    // Getters and Setters:

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
