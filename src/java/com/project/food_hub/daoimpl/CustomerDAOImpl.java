/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.CustomerDAO;
import com.project.food_hub.entities.Customer;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class CustomerDAOImpl implements CustomerDAO
{
Connection con = DBConnection.getConnection();
    @Override
    public int addCustomer(Customer customer) {
        
        
    try {
      PreparedStatement psmt = con.prepareStatement("Insert Customer(String customerName,String address,String emailId,int contactNo,String date,String password) Values(?,?,?,?,?,?)");
        psmt.setString(1,customer.getCustomerName());
        psmt.setString(2,customer.getAddress());
        psmt.setString(3,customer.getEmailId());
        psmt.setInt(4,customer.getContactNo());
        psmt.setString(5,customer.getDate());
        psmt.setString(6,customer.getPassword());
    } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
   return 0;
    }

    @Override
    public int deleteCustomer(int customerId) {
    try {
        int count = 0;
        PreparedStatement psmt = con.prepareStatement("delete from customer where customerId(?)");
        psmt.setInt(1,customerId);
                
                } catch (SQLException ex) {
        Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public Customer getCustomerByID(int customerId) {
        return null;
    }

    @Override
    public int updateCustomer(int customerId, Customer customer) {
        return 0;
    }
    
}
