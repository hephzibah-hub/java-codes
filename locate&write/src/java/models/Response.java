/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Richeal Ayettey
 */
public class Response {
    private String userId;
    private String userAlias;
    private String userPass1;
    private String userPass2;
    private String customerNumber;
    private String fLogin;
    private String status;
    private String approvedDate;                   

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getUserPass1() {
        return userPass1;
    }

    public void setUserPass1(String userPass1) {
        this.userPass1 = userPass1;
    }

    public String getUserPass2() {
        return userPass2;
    }

    public void setUserPass2(String userPass2) {
        this.userPass2 = userPass2;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getfLogin() {
        return fLogin;
    }

    public void setfLogin(String fLogin) {
        this.fLogin = fLogin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    @Override
    public String toString() {
        return "Response{" + "userId=" + userId + ", userAlias=" + userAlias + ", userPass1=" + userPass1 + ", userPass2=" + userPass2 + ", customerNumber=" + customerNumber + ", fLogin=" + fLogin + ", status=" + status + ", approvedDate=" + approvedDate + '}';
    }

    
    
}
