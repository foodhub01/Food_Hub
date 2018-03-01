/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.CustomerDAO;
import com.project.food_hub.entities.Customer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class CustomerDAOImpl implements CustomerDAO
{

    @Override
    
    public int addCustomer(Customer customer) {
        int count = 0;
        
    try {
        Connection con = DBConnection.getConnection();
        PreparedStatement preparedstatement = con.prepareStatement("Insert into Customer(customerName,address,emailId,contactNo,BirthDate,password) Values(?,?,?,?,?,?)");
        preparedstatement.setString(1,customer.getCustomerName());
        preparedstatement.setString(2,customer.getAddress());
        preparedstatement.setString(3,customer.getEmailId());
        preparedstatement.setString(4,customer.getContactNo());
        java.util.Date date = new java.util.Date(customer.getDate());
        preparedstatement.setDate(5,new Date(date.getYear(),date.getMonth(),date.getDay()));
        preparedstatement.setString(6,customer.getPassword());
        count = preparedstatement.executeUpdate();
    }   catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
   return count;
    }

    @Override
    public int deleteCustomer(int customerId) {
        int count = 0;
        try {
        Connection con = DBConnection.getConnection();
        PreparedStatement psmt = con.prepareStatement("delete from customer where customerId(?)");
        psmt.setInt(1,customerId);
        count = psmt.executeUpdate();
                
                } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    return count;
    }

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customerList = null;
        try {

        Connection con = DBConnection.getConnection();
        PreparedStatement psmt = con.prepareStatement("select * from Customer");
        ResultSet resultSet = psmt.executeQuery();
        customerList = new ArrayList<Customer>();
        if(resultSet!=null){
         while(resultSet.next()){
           int customerId = resultSet.getInt(1);
           String customerName = resultSet.getString(2);
           String address = resultSet.getString(3);
           String emailId = resultSet.getString(4);
           String contactNo = resultSet.getString(5);
           String date = resultSet.getString(6);
           String password = resultSet.getString(7);
           Customer customer = new Customer(customerId, customerName, address, emailId, contactNo, date, password);
           customerList.add(customer);
         }   
        }
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        return customerList;
    }

    @Override
    public Customer getCustomerByID(int customerId) {
         List<Customer> customerList = null;
        try {
        Connection con = DBConnection.getConnection();
        PreparedStatement psmt = con.prepareStatement("select * from Customer where customer_Id=?");
         psmt.setInt(1,customerId);
        ResultSet resultSet = psmt.executeQuery();
        customerList = new ArrayList<Customer>();
        if(resultSet!=null){
         while(resultSet.next()){
           int customerid = resultSet.getInt(1);
           String customerName = resultSet.getString(2);
           String address = resultSet.getString(3);
           String emailId = resultSet.getString(4);
           String contactNo = resultSet.getString(5);
           String date = resultSet.getString(6);
           String password = resultSet.getString(7);
           Customer customer = new Customer(customerid, customerName, address, emailId, contactNo, date, password);
           customerList.add(customer);
         }   
        }
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
        if(customerList.size()>0) return customerList.get(0);
        else return null;
        
    }

    @Override
    public int updateCustomer(int customerId,Customer customer){
         int count = 0;
        try {
          Connection con = DBConnection.getConnection();
        PreparedStatement psmt = con.prepareStatement("update customer set customerName=?,address=?,emailId=?,contactNo=?,Birthdate=?,password=? where customerId=?");
        psmt.setString(1,customer.getCustomerName());
        psmt.setString(2,customer.getAddress());
        psmt.setString(3,customer.getEmailId());
        psmt.setString(4,customer.getContactNo());
        psmt.setString(5,customer.getDate());
        psmt.setString(6,customer.getPassword());
        count =  psmt.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    return count;
    }
    

}