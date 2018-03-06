/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.testApp;

import com.project.food_hub.dao.CustomerDAO;
import com.project.food_hub.dao.TableDAO;
import com.project.food_hub.daoimpl.CustomerDAOImpl;
import com.project.food_hub.daoimpl.TableDAOImpl;
import com.project.food_hub.entities.Customer;
import com.project.food_hub.entities.Table;
import java.util.List;

/**
 *
 * @author RaHuL
 */
public class TestApp {
   public static void main(String[] args){
        CustomerDAO customerDAO = new CustomerDAOImpl();
//        int count = customerDAO.addCustomer(new Customer("vedant","xabc1696956","rveda789456@gmail.com","968484587","1975/11/17","5473858"));
//        if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added"); 
//     
       int count=customerDAO.deleteCustomer(100001);
       if(count>0)System.out.println("Record Deleted Successfully");
       else System.out.println("Record Failed to get deleted");
////        TableDAO tableDAO = new TableDAOImpl();
//        int count = tableDAO.addTable(new Table(2));
//                if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
//        
//      
         List<Customer> customerlist = customerDAO.getAllCustomer();
        for(Customer cust : customerlist){
            System.out.println(cust.getCustomerId()+ "|" + cust.getCustomerName()+ "|" + cust.getEmailId());
        }
        Customer cust = customerDAO.getCustomerByID(100002);
            System.out.println(cust.getCustomerId()+ "|" + cust.getCustomerName()+ "|" + cust.getEmailId());
    
   }
}
