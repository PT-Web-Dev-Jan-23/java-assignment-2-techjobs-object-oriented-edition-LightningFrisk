package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //  Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
