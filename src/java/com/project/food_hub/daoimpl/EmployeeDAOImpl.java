/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.EmployeeDAO;
import com.project.food_hub.entities.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class EmployeeDAOImpl implements EmployeeDAO{
     @Override
    public int addEmployee(Employee employee) {
        int count = 0;
        try {
             Connection con = DBConnection.getConnection();
  
            PreparedStatement psmt = con.prepareStatement("Insert into Employee() Values(?,?,?,?)");
            psmt.setString(1,employee.getEmployeeName());
            psmt.setString(2,employee.getDesignation());
            psmt.setInt(3,employee.getEmployeeContact());
            psmt.setString(4,employee.getEmployeePassword());
            count  = psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    return count;
    }

    @Override
    public int deleteCustomer(int employeeId) {
        int count = 0;
         try {
             Connection con = DBConnection.getConnection();
             PreparedStatement psmt = con.prepareStatement("delete from employee where employeeId = ?");
             psmt.setInt(1,employeeId);
             count = psmt.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return count;
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees");
            ResultSet resultSet = preparedStatement.executeQuery();
            employeeList = new ArrayList<Employee>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int employeeId = resultSet.getInt(1);
                    String employeeName = resultSet.getString(2);
                    String designation = resultSet.getString(3);
                    int employeeContact = resultSet.getInt(4);
                    String employeePassword = resultSet.getString(5);
                    Employee employee = new Employee(employeeId,employeeName,designation,employeeContact,employeePassword);
                    employeeList.add(employee);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
     return employeeList;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
    List<Employee> employeeList = null;
        try {
            Connection connection = DBConnection.getConnection(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees");
            ResultSet resultSet = preparedStatement.executeQuery();
            employeeList = new ArrayList<Employee>();
            if(resultSet!=null){
                while(resultSet.next()){
                    int employeeId = resultSet.getInt(1);
                    String employeeName = resultSet.getString(2);
                    String designation = resultSet.getString(3);
                    int employeeContact = resultSet.getInt(4);
                    String employeePassword = resultSet.getString(5);
                    Employee employee = new Employee(employeeId,employeeName,designation,employeeContact,employeePassword);
                    employeeList.add(employee);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (employeeList.size()>0) return employeeList.get(0);
        else return null;
    }

    @Override
    public int updateEmployee(int employeeId, Employee employee) {
        
             int count = 0; 
        try {
             Connection con = DBConnection.getConnection();
             PreparedStatement psmt = con.prepareStatement("update Employee set  employeeName=?,designation=?,employeecontact=?,employeePassword=? where employeeId=?");
             psmt.setString(1,employee.getEmployeeName());
             psmt.setString(2,employee.getDesignation());
             psmt.setInt(3,employee.getEmployeeContact());
             psmt.setString(4,employee.getEmployeePassword());
             psmt.setInt(5,employeeId);
             count = psmt.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(EmployeeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
        return count;
    }
    
}
