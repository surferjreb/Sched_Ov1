package com.brownj;

public class Company {

    private String name;

    Company(){
        this.name = null;
    }
//-------------------------------------------------------------
    public void setName(String name){
        this.name = name;
    }
//-------------------------------------------------------------

    @Override
    public String toString() {
        return name;
    }
}//End Class
