package com.brownj;

public class Technician extends Person {
    private Company myCompany;
    private Person tech;

    Technician(){
        tech = new Person();
        myCompany = new Company();
    }
//-----------------------------------------------------------------
    public String getCompany() {
        return myCompany.toString();
    }
//-----------------------------------------------------------------
    private void setCompany(String company) {
        myCompany.setName(company);
    }
//-----------------------------------------------------------------
    public void setTechnician(String fName, String lName, String phNumber, String email, String company){
        try {
            tech.setFirstName(fName);
            tech.setLastName(lName);
            tech.setPhNumber(phNumber);
            tech.setEmail(email);
            setCompany(company);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
//------------------------------------------------------------------
    @Override
    public String toString(){
        return "Name: " + tech.toString() + "\n" + "Company: " + myCompany.toString();
    }
//==================================================================
    public static void main(String[] args){
        Technician tech = new Technician();

        tech.setTechnician("James", "Brown", "7573830693", "surferjreb@live.com",
                "Tech Pro's Inc");

        System.out.println(tech.toString());
    }
}
