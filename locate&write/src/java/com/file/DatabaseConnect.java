/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Richeal Ayettey
 */
public class DatabaseConnect {
    private static String hostName = "192.168.1.60";
    private static String portNumber = "7788";
    private static String serviceName = "unsgpdb";
    private static String userName = "BANKOWNER";
    private static String password = "pass1234";
    private static Connection connection;

    public DatabaseConnect() {
    }

    /**
     * Connect to database
     *
     * @return Connection
     * @throws SQLException
     */
    
    
    public  Connection connect() throws SQLException {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        StringBuilder connectionStr = new StringBuilder("jdbc:oracle:thin:@//");
        connectionStr.append(hostName).append(":")
                .append(portNumber).append("/")
                .append(serviceName);

        System.out.println(connectionStr.toString());
        connection = DriverManager.getConnection(connectionStr.toString(), userName, password);

        return connection;
    }

    public ResultSet getResult(String user_id) throws SQLException {

        connect();
        Statement stmt = connection.createStatement();
        //step4 execute query
        ResultSet rs;
        rs = stmt.executeQuery(
                "SELECT USER_ID,USER_ALIAS,USER_PASS1,USER_PASS2,USER_CUSTOMER_NO,F_LOGIN,STATUS,APPROVAL_DATE "
              + "FROM USER_PROFILE_O "
              + "WHERE USER_ID ='" + user_id + "'");
        
//        while (rs.next()) {
//            String user_id = rs.getString("user_id");
//            String user_alias = rs.getString("user_alias");
//            String user_pass1 = rs.getString("user_pass1");
//            String user_pass2 = rs.getString("user_pass2");
//            String user_customer_no = rs.getString("user_customer_no");
//            String f_login = rs.getString("f_login");
//            String status = rs.getString("status");
//            String approved_date = rs.getString("approval_date");
//
//            System.out.println(user_id + "   " + user_alias + "    " + user_pass1 + "     " + user_pass2 + "    " + user_customer_no + "    " + f_login + "    " + status + "  " + approved_date);
//        }
        
        return rs;

    }

}
