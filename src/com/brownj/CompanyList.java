package com.brownj;

import java.util.ArrayList;

public class CompanyList {
    private static CompanyList companyList = null;
    private ArrayList<Company> companies;

    private CompanyList(){
        companies = new ArrayList<>();
    }

    public static CompanyList getInstance(){
        if(companyList == null){
            companyList = new CompanyList();
        }

        return companyList;
    }
//------------------------------------------------------
    public void addCompanyToList(String name){
        if(!checkCompanyName(name)){
            Company newCompany = new Company();
            newCompany.setName(name);
            companies.add(newCompany);
        }

    }
//------------------------------------------------------
    public ArrayList<Company> getCompanyList(){
        if(!companies.isEmpty()){
            return companies;
        }

        return null;
    }
//------------------------------------------------------
    private boolean checkCompanyName(String name){

        for (Company company : companies) {
            if (company.toString().equals(name)) {
                return true;
            }
        }

        return false;
    }
//------------------------------------------------------
}
