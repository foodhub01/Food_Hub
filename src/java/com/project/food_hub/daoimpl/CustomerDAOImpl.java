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
      PreparedStatement psmt = con.prepareStatement("Insert Customer(String customerName,String address,String emailId,int contactNo,String date,String password) Values(?,?,?,?,?,?)");
        psmt.setString(1,customer.getCustomerName());
        psmt.setString(2,customer.getAddress());
        psmt.setString(3,customer.getEmailId());
        psmt.setInt(4,customer.getContactNo());
        psmt.setString(5,customer.getDate());
        psmt.setString(6,customer.getPassword());
        count = psmt.executeUpdate();
    } catch (SQLException ex) {
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
           int contactNo = resultSet.getInt(5);
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
        PreparedStatement psmt = con.prepareStatement("select * from Customer where customerId=?");
         psmt.setInt(1,customerId);
        ResultSet resultSet = psmt.executeQuery();
        customerList = new ArrayList<Customer>();
        if(resultSet!=null){
         while(resultSet.next()){
           int customerId = resultSet.getInt(1);
           String customerName = resultSet.getString(2);
           String address = resultSet.getString(3);
           String emailId = resultSet.getString(4);
           int contactNo = resultSet.getInt(5);
           String date = resultSet.getString(6);
           String password = resultSet.getString(7);
           Customer customer = new Customer(customerId, customerName, address, emailId, contactNo, date, password);
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
        PreparedStatement psmt = con.prepareStatement("update customer set customerName=?,address=?,emailId=?,contactNo=?,date=?,password=? where customerId=?");
        psmt.setString(1,customer.getCustomerName());
        psmt.setString(2,customer.getAddress());
        psmt.setString(3,customer.getEmailId());
        psmt.setInt(4,customer.getContactNo());
        psmt.setString(5,customer.getDate());
        psmt.setString(6,customer.getPassword());
        count =  psmt.executeUpdate();
        } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    return count;
    }
    

}


        

