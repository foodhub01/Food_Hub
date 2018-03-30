/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.food_hub.servlets;

import com.project.food_hub.dao.EmployeeDAO;
import com.project.food_hub.daoimpl.EmployeeDAOImpl;
import com.project.food_hub.entities.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vedant
 */
public class EditEmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             int employeeid;
            
            String action = request.getParameter("action");
            
            employeeid = Integer.parseInt(request.getParameter("employeeid"));
            EmployeeDAO employeeDAO = new EmployeeDAOImpl();
            int count = 0;
            if(action.equals("Save Changes")){
               String employeeName;
               String userName;
               String designation;
               String employeeContact;
               String employeePassword;
                   
               employeeName = request.getParameter("employeeName");
               userName = request.getParameter("userName");
               designation = request.getParameter("designation");
               employeeContact=request.getParameter("employeeContact");
               employeePassword=request.getParameter("employeePassword");
                count = employeeDAO.updateEmployee(employeeid,new Employee(employeeName,userName,designation,employeeContact,employeePassword));
                }
            else if(action.equals("Delete")){
                count = employeeDAO.deleteEmployee(employeeid);
            }
             RequestDispatcher rd = null;
            if(count>0){
               rd = request.getRequestDispatcher("employeelist.do");
            }
            else{
                rd = request.getRequestDispatcher("editemployee.jsp?employeeId="+employeeid);
            }
            rd.include(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
