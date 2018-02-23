/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.EmployeeDAO;
import com.project.food_hub.entities.Employee;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    Connection con = DBConnection.getConnection();
    @Override
    public int addEmployee(Employee employee) {
        
        try {
            PreparedStatement psmt = con.prepareStatement("Insert into Employee() Values(?,?,?,?)");
            psmt.setString(1,employee.getEmployeeName());
            psmt.setString(2,employee.getDesignation());
            psmt.setInt(3,employee.getEmployeeContact());
            psmt.setString(4,employee.getEmployeePassword());
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return 0;
    }

    @Override
    public int deleteCustomer(int employeeId) {
        return 0;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
    return null;
    }

    @Override
    public int updateEmployee(int employeeId, Employee employee) {
        return 0;
    }
    
}
