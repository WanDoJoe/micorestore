package com.wdq.micorestore.bean;
//`id` int(64) NOT NULL AUTO_INCREMENT,
//        `loginname` varchar(64) NOT NULL,
//        `password` varchar(32) NOT NULL DEFAULT 'f379eaf3c831b04de153469d1bec345e',
//        `state` varchar(8) NOT NULL DEFAULT '1',
//        `salt` varchar(255) DEFAULT 'microstore',
//        `type` varchar(255) DEFAULT '1',
//        `createdata` date DEFAULT NULL,
//        `phone` varchar(255) DEFAULT NULL,
//        `address` varchar(255) DEFAULT NULL,
//        `firstname` varchar(255) DEFAULT NULL,
//        `lastname` varchar(255) DEFAULT NULL,
//        `role` varchar(255) NOT NULL DEFAULT 'user',
public class UserBean {
    private int id;
    private String loginname;
    private String password;
    private String state;
    private String salt;
    private String type;
    private String createdata;
    private String phone;
    private String address;
    private String firstname;
    private String lastname;
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedata() {
        return createdata;
    }

    public void setCreatedata(String createdata) {
        this.createdata = createdata;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
