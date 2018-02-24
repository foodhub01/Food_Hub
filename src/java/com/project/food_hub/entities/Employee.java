/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.entities;

/**
 *
 * @author RaHuL
 */
public class Employee {

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(int employeeContact) {
        this.employeeContact = employeeContact;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    public Employee(int employeeId, String employeeName, String designation, int employeeContact, String employeePassword) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.employeeContact = employeeContact;
        this.employeePassword = employeePassword;
    }

    public Employee(String employeeName, String designation, int employeeContact, String employeePassword) {
        this.employeeName = employeeName;
        this.designation = designation;
        this.employeeContact = employeeContact;
        this.employeePassword = employeePassword;
    }
    int employeeId;
    String employeeName;
    String designation;
    int employeeContact;
    String employeePassword;
    
    
}