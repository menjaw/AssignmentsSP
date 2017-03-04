/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Menja
 */
@WebServlet(name = "ProxySolution", urlPatterns = {"/ProxySolution"})
public class ProxySolution extends HttpServlet {

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
        response.setContentType("application/json");
        //refererer til js filens URL efter ?
        String getURLCode = request.getParameter("codes");
        System.out.println("get parameter from js page");

        //Skaber en ny URL med det tilsendte parameter 
        URL url = new URL("http://restcountries.eu/restv1/alpha/?codes=" + getURLCode);
        System.out.println("create connection to URL");

        //Skaber en ny forbindelse til URL
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json:charset=UFT-8");

        //String jsonString;
        try (Scanner scan = new Scanner(conn.getInputStream())) {
            String jsonString = "Test om der findes data";
            if (scan.hasNext()) {
                jsonString = scan.nextLine();
            }
            scan.close();
            //System.out.println(jsonString);
            //Create new PrintWriter.
            PrintWriter out = response.getWriter();
            //Write the json object.
            out.print(jsonString);
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
//Cross Origin Calls er når man laver et request fra en hjemmeside til en anden hjemmeside (Origin er hjemmeside/ip-addresse)(opstår fra browsere)
//Problemet opstår hvis serveren ikke er opsat til at måtte sende et response på et Cross origin Request.
//Lav et mellemled (proxy), der opstår ikke Cross Origin hvis der foregår fra en server
//
