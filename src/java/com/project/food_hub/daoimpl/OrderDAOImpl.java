/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.OrderDAO;
import com.project.food_hub.entities.Order;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class OrderDAOImpl implements OrderDAO {

    @Override
    public int addOrder(Order order) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Insert order(int customerId,int productId,int employeeId,int quantity,int billNo,String date)values(?,?,?,?,?,?)");
            psmt.setInt(1,order.getCustomerId());
            psmt.setInt(2,order.getProductId());
            psmt.setInt(3,order.getEmployeeId());
            psmt.setInt(4,order.getQuantity());
            psmt.setInt(5,order.getBillNo());
            psmt.setString(6,order.getDate());
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteOrder(int orderId) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Delete from order where orderId=?");
            psmt.setInt(1, orderId);
            count=psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public List<Order> getAllOrder() {
         List<Order> orderList=null;
        try {
           
            Connection con= DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Select *from order");
            ResultSet resultSet=psmt.executeQuery();
            orderList= new ArrayList<Order>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int customerId = resultSet.getInt(1);
                    int productId = resultSet.getInt(2);
                    int employeeId = resultSet.getInt(3);
                    int quantity = resultSet.getInt(4);
                    int billNo= resultSet.getInt(5);
                    String date= resultSet.getString(6);
                    Order order = new Order(customerId,productId,employeeId,quantity,billNo,date);
                    orderList.add(order);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            return orderList;
    }

    @Override
    public Order getOrderById(int orderId) {
          List<Order> orderList=null;
        try {
           
            Connection con= DBConnection.getConnection();
            PreparedStatement psmt=con.prepareStatement("Select *from order where orderId=?");
            psmt.setInt(1, orderId);
            ResultSet resultSet=psmt.executeQuery();
            orderList= new ArrayList<Order>();
            if(resultSet!=null){
                //resultSet.first();
                while(resultSet.next()){
                    int customerId = resultSet.getInt(1);
                    int productId = resultSet.getInt(2);
                    int employeeId = resultSet.getInt(3);
                    int quantity = resultSet.getInt(4);
                    int billNo= resultSet.getInt(5);
                    String date= resultSet.getString(6);
                    Order order = new Order(customerId,productId,employeeId,quantity,billNo,date);
                    orderList.add(order);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(orderList.size()>0)return orderList.get(0);
        else return null;

    }

    @Override
    public int updateOrder(int orderId, Order order) {
        int count=0;
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement psmt = con.prepareStatement("Update order set customerId=?, productId=?,employeeId=?,quantity=?,billno=?,date=? where orderId=? ");
            psmt.setInt(1,order.getCustomerId());
            psmt.setInt(2,order.getProductId());
            psmt.setInt(3,order.getEmployeeId());
            psmt.setInt(4,order.getQuantity());
            psmt.setInt(5,order.getBillNo());
            psmt.setString(6,order.getDate());
            psmt.setInt(7, orderId);
            count=psmt.executeUpdate();
       
        } catch (SQLException ex) {
            Logger.getLogger(OrderDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }       
    
}