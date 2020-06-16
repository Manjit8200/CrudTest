package com.codding.Practical.dto;

import com.codding.Practical.domain.Employee;

public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;

    private String emailId;
    private String mobileNo;
    private String surName;
    private String favouriteName ;
    private String mobileNo2;
    private String businessAddress;
    private String residenceAddress;
    private String websiteAddress;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Employee employee) {
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();

        this.emailId = employee.getEmailId();

        this.mobileNo = employee.getMobileNo();
        this.id = employee.getId();
        this.surName = employee.getSurName();
        this.favouriteName = employee.getFavouriteName();
        this.mobileNo2 = employee.getMobileNo2();
        this.businessAddress = employee.getBusinessAddress();
        this.residenceAddress = employee.getResidenceAddress();
        this.websiteAddress = employee.getWebsiteAddress();
    }

    public EmployeeDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getEmailId() {
        return emailId;
    }


    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }



    public String getMobileNo() {
        return mobileNo;
    }


    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFavouriteName() {
        return favouriteName;
    }

    public void setFavouriteName(String favouriteName) {
        this.favouriteName = favouriteName;
    }

    public String getMobileNo2() {
        return mobileNo2;
    }

    public void setMobileNo2(String mobileNo2) {
        this.mobileNo2 = mobileNo2;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }
}
