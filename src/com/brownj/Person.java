package com.brownj;

public class Person {

    private String fName;
    private String lName;
    private String phNumber;
    private String email;
    private final String NOVALUE = "NONE";

    Person() {
        fName = NOVALUE;
        lName = NOVALUE;
        phNumber = NOVALUE;
        email = NOVALUE;
    }

//set values
    public void setFirstName(String fName) {
        this.fName = fName;
    }
//---------------------------------------------------------------
    public void setLastName(String lName) {
        this.lName = lName;
    }
//---------------------------------------------------------------
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }
//---------------------------------------------------------------
    public void setEmail(String email) {
        this.email = email;
    }
//---------------------------------------------------------------
//get values
    public String getFirstName() {
        return fName;
    }
//--------------------------------------------------------
    public String getLastName() {
        return lName;
    }
//--------------------------------------------------------
    public String getPhNumber() {
        return phNumber;
    }
//--------------------------------------------------------
    public String getEmail() {
        return email;
    }
//--------------------------------------------------------
    @Override
    public String toString() {
        String name = fName + " " + lName;

        return name;
    }

//================================================================
// test
//================================================================
    public static void main(String[] args){
        Person myPerson;
        Person myPerson2;

        myPerson = new Person();
        myPerson2 = new Person();

        myPerson.setFirstName("James");
        myPerson.setLastName("Brown");

        myPerson2.setFirstName("Robert");
        myPerson2.setLastName("Kinsinger");

        System.out.println(myPerson.toString());
        System.out.println(myPerson2.toString());
    }//end main

}//end class


