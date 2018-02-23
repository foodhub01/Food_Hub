/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.daoimpl;

import com.project.food_hub.dao.FloorBookingDAO;
import com.project.food_hub.entities.FloorBooking;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RaHuL
 */
public class FloorBookingDAOImpl implements FloorBookingDAO{
    Connection con = DBConnection.getConnection();

    @Override
    public int addFloorBooking(FloorBooking floorbooking) {
        int count = 0;
        try {
            PreparedStatement psmt = con.prepareStatement("Insert FloorBooking() into values(?,?)");
            psmt.setInt(1,floorbooking.getBookFloorId());
            psmt.setInt(2,floorbooking.getFloorNo());
            psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FloorBookingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public int deleteCustomer(int bookFloorId) {
       return 0;
    }

    @Override
    public List<FloorBooking> getAllFloorBooking() {
        return null;
    }

    @Override
    public FloorBooking getFloorBookingbyId(int bookFloorId) {
        return null;
    }

    @Override
    public int updateFloorBooking(int bookfloorId, FloorBooking floorbooking) {
        return 0;
    }
    
}
