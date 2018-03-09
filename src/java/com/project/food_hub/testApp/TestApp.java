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
import com.project.food_hub.*;
import com.project.food_hub.dao.EmployeeDAO;
import com.project.food_hub.dao.OrderDAO;
import com.project.food_hub.dao.ProductDAO;
import com.project.food_hub.daoimpl.EmployeeDAOImpl;
import com.project.food_hub.daoimpl.OrderDAOImpl;
import com.project.food_hub.daoimpl.ProductDAOImpl;
import com.project.food_hub.entities.Employee;
import com.project.food_hub.entities.Order;
import com.project.food_hub.entities.Product;
import com.project.food_hub.entities.Table;

import java.util.List;

/**
 *
 * @author RaHuL
 */
public class TestApp {
   public static void main(String[] args){
//        CustomerDAO customerDAO = new CustomerDAOImpl();
////        int count = customerDAO.addCustomer(new Customer("vedant","vedant03","xcbc1696956","veda96@gmail.com","9884845874","1975/05/15","5473858"));
////        if(count>0)System.out.println("Record Added Successfully");
////        else System.out.println("Record Failed to get added"); 
////     
////      int count=customerDAO.deleteCustomer(100001);
////       if(count>0)System.out.println("Record Deleted Successfully");
////       else System.out.println("Record Failed to get deleted");
//
//       
//        Customer customer =  new Customer(100002,"karan","karan05","bhayandar","karan@gamil.com","1122145645","1994-12-12","987987987");
//       int count = customerDAO.updateCustomer(100002, customer);
//         if(count>0)System.out.println("Record updated Successfully");
//       else System.out.println("Record Failed to get updated");
//
//         List<Customer> customerlist = customerDAO.getAllCustomer();
//        for(Customer cust : customerlist){
//            System.out.println(cust.getCustomerId()+ "|" + cust.getCustomerName()+ "|" + cust.getUserName()+ "|" + cust.getEmailId()+ "|" + cust.getContactNo());
//        }
//        Customer cust = customerDAO.getCustomerByID(100001);
//            System.out.println(cust.getCustomerId()+ "|" + cust.getCustomerName()+ "|" + cust.getEmailId());
//    
//          TableDAO tableDAO = new TableDAOImpl();
//          int count = tableDAO.addTable(new Table(3));
//          if(count>0)System.out.println("Record Added Successfully");
//          else System.out.println("Record Failed to get added");
////          
////          count = tableDAO.deleteTable(2);
////          if(count>0)System.out.println("Record Deleted Successfully");
////          else System.out.println("Record Failed to get deleted");
//////          
////          Table table = new Table(5);
////          int count = tableDAO.updateTable(5,table);
////          
////          List<Table> tablelist = tableDAO.getAllTable();
////          for(Table t : tablelist){
////              System.out.println(t.getTableNo() +"|"+ t.getCapacity());
////          }
//          
//          Table t = tableDAO.getTableById(1);
//          System.out.println(t.getTableNo() +"|"+ t.getCapacity());


//          EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        int count = employeeDAO.addEmployee(new Employee("rahul01","rahul00","HR","8879888874","987987987"));
//        if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
//        
//       int count=employeeDAO.deleteEmployee(500001);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
        
//        Employee employee = new Employee("rp","rahul005","assitant","9879859874","987987987");
//       int  count=employeeDAO.updateEmployee(500002, employee);
//        if(count>0)System.out.println("Record Updated Successfully");
//        else System.out.println("Record Failed to get updated");
//
//        List<Employee> employeelist = employeeDAO.getAllEmployee();
//        for(Employee emp : employeelist){
//            System.out.println(emp.getEmployeeId() + "|" + emp.getEmployeeName() + "|" + emp.getDesignation());
//        }
//        
//        Employee emp = employeeDAO.getEmployeeById(500003);
//            System.out.println(emp.getEmployeeId() + "|" + emp.getEmployeeName() + "|" + emp.getEmployeeContact());
//

        OrderDAO orderDAO = new OrderDAOImpl();
        int count = orderDAO.addOrder(new Order(100002,1,500002,1,1,"2017/03/05"));
        if(count>0)System.out.println("Record Added Successfully");
        else System.out.println("Record Failed to get added");
//        
//        count= orderDAO.deleteOrder(2);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
//        
//        Order order = new Order(100001,3,500001,1,1,"2018-02-05");
//        count=orderDAO.updateOrder(1, order);
//        if(count>0)System.out.println("Record Updated Successfully");
//        else System.out.println("Record Failed to get updated");
        
        List<Order> orderlist = orderDAO.getAllOrder();
        for(Order or : orderlist){
            System.out.println(or.getOrderId() + "|" + or.getProductId() + "|" + or.getQuantity());
        }
        Order or = orderDAO.getOrderById(3);
         System.out.println(or.getOrderId() + "|" + or.getProductId() + "|" + or.getQuantity());
   
   
//   
//        ProductDAO productDAO = new ProductDAOImpl();
//        int count = productDAO.addProduct(new Product("water bottle",10,100));
//        if(count>0)System.out.println("Record Added Successfully");
//        else System.out.println("Record Failed to get added");
//        
//        count= productDAO.deleteProduct(2);
//        if(count>0)System.out.println("Record Deleted Successfully");
//        else System.out.println("Record Failed to get deleted");
//        
//        Product product = new Product("water",15,90);
//        count= productDAO.updateProduct(1, product);
//        if(count>0)System.out.println("Record Updated Successfully");
//        else System.out.println("Record Failed to get updated");
//        
//        List<Product> productlist = productDAO.getAllProduct();
//        for(Product pro : productlist){
//            System.out.println(pro.getProductId() + "|" + pro.getProductName() + "|" + pro.getPrice());
//        }
//        Product pro = productDAO.getProductById(1);
//        System.out.println(pro.getProductId() + "|" + pro.getProductName() + "|" + pro.getPrice());
   
   
   
   
   
   
   }
}
