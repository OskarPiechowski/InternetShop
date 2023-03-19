package com.shop.sklepinternetowy.request;

public class RegisterRequest {

    private String UserName;

    private String password1;

    private String password2;

    public RegisterRequest() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "ClientName='" + UserName + '\'' +
                ", password1='" + password1 + '\'' +
                ", password2='" + password2 + '\'' +
                '}';
    }
}
