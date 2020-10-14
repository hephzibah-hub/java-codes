package com.file;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import models.Response;
import javax.ws.rs.QueryParam;

@Path("service")
public class ServiceResource {

    @Context
    private UriInfo context;
    private String[][] QureyParam;

    public ServiceResource() {
//        this.<error> = (;
    }

    @Path("createFile")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String createFile() {
        String responseMessage = null;

        String path = "c:\\NewDirectory";//c:/NEWFILE
        File file = new File(path);
        if (file.exists()) {
            responseMessage = "Directory is already created.";
            System.out.print("Directory is already created.");
        } else {
            file.mkdir();
            responseMessage = "Directory created successfully";
        }

        return responseMessage;

    }

    @Path("fetchDB")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Object FetchDB(@QueryParam("user_id") String userid
    ) throws SQLException {

        DatabaseConnect databaseConnect = new DatabaseConnect();
        ResultSet dbResult = databaseConnect.getResult(userid);
        //String user_id = getString("user_id");{

        String user_pass1 = null;
        String user_pass2 = null;
        String user_customer_no = null;
        String f_login = null;
        String status = null;
        String approval_date = null;
        while (dbResult.next()) {
            user_pass1 = dbResult.getString("user_pass1");
            user_pass2 = dbResult.getString("user_pass2");
            user_customer_no = dbResult.getString("user_customer_no");
            f_login = dbResult.getString("f_login");
            status = dbResult.getString("status");
            approval_date = dbResult.getString("approval_date");
        }

        NewClass1 newClass1 = new NewClass1();
        newClass1.setUserpass1(user_pass1);
        newClass1.setUserpass2(user_pass2);
        newClass1.setUserCustomerNo(user_customer_no);
        newClass1.setFlogin(f_login);
        newClass1.setStatus(status);
        newClass1.setApprovalName(approval_date);

        return newClass1;
    }

}
/*
    public ArrayList<UserAccessList> fetchDB(@QueryParam("user_id") String user_id, @QueryParam("user_pass1") String user_pass1, @QueryParam("user_pass2") String user_pass2, @QueryParam("user_customer_no") String user_customer_no, @QueryParam("f_login") String f_login, @QueryParam("status") String status, @QueryParam("approved_date") String approved_date) 
            throws SQLException, IOException {

        Response responseMessage = new Response();
        DetailsCall detailsCall = new DetailsCall();
        

        

        while (dbResult.next()) {
            String user_id = dbResult.getString("user_id");
            String user_alias = dbResult.getString("user_alias");
            String user_pass1 = dbResult.getString("user_pass1");
            String user_pass2 = dbResult.getString("user_pass2");
            String user_customer_no = dbResult.getString("user_customer_no");
            String f_login = dbResult.getString("f_login");
            String status = dbResult.getString("status");
            String approved_date = dbResult.getString("approval_date");

            responseMessage.setUserId(user_id);
            responseMessage.setUserAlias(user_alias);
            responseMessage.setUserPass1(user_pass1);
            responseMessage.setUserPass2(user_pass2);
            responseMessage.setCustomerNumber(user_customer_no);
            responseMessage.setfLogin(f_login);
            responseMessage.setStatus(status);
            responseMessage.setApprovedDate(approved_date);
    } 
       
          //  HashMap<String, String> response = new HashMap<String, String>();
          //  response.put("responseMessage", responseMessage);
       
        
        String jsonResponseMessage = new Gson().toJson(responseMessage);
    //response.
    //responseMessage  = "user_id","user_alias","user_pass1","user_pass2","user_customer_no","f_login","status","approval_date";

    return jsonResponseMessage ;

    return detailsCall.fetchDB();
}
 */
