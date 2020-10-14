/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.file;

/**
 *
 * @author Richeal Ayettey
 */
public class NewClass1 {
    
    private String userpass1;
    private String userpass2;
    private String flogin;
    private String usercustomerNo;
    private String status;
    private String approvalName;

    public NewClass1() {
    }

    public String getUserpass1() {
        return userpass1;
    }

    public void setUserpass1(String userpass1) {
        this.userpass1 = userpass1;
    }

    public String getUserpass2() {
        return userpass2;
    }

    public void setUserpass2(String userpass2) {
        this.userpass2 = userpass2;
    }

    public String getFlogin() {
        return flogin;
    }

    public void setFlogin(String flogin) {
        this.flogin = flogin;
    }

    public String getUserCustomerNo() {
        return usercustomerNo;
    }

    public void setUsercustomerNo(String customerNo) {
        this.usercustomerNo = usercustomerNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName;
    }

    @Override
    public String toString() {
        return "NewClass1{" + "userpass1=" + userpass1 + ", userpass2=" + userpass2 + ", flogin=" + flogin + ", usercustomerNo=" + usercustomerNo + ", status=" + status + ", approvalName=" + approvalName + '}';
    }

    void setUserCustomerNo(String user_customer_no) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
