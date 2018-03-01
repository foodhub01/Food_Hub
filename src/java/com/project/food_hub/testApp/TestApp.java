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

/**
 *
 * @author RaHuL
 */
public class TestApp {
   public static void main(String[] args){
        CustomerDAO customerDAO = new CustomerDAOImpl();
        int count = customerDAO.addCustomer(new Customer("qwert","xyz1696956","rp789456@gmail.com","1239874560","1985/11/17","123456789"));
        if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added"); 
   
    
//        TableDAO tableDAO = new TableDAOImpl();
//        int count = tableDAO.addTable(new Table(5));
//                if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
//        
   }
}
