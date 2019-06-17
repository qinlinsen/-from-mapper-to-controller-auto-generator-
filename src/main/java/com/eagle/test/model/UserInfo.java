package com.eagle.test.model;

import javax.persistence.*;

@Table(name = "`USER_INFO`")
public class UserInfo {
    @Id
    @Column(name = "`ID`")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`USERNAME`")
    private String username;

    @Column(name = "`PASSWORD`")
    private String password;

    @Column(name = "`USERTYPE`")
    private String usertype;

    @Column(name = "`ENABLED`")
    private Integer enabled;

    @Column(name = "`REALNAME`")
    private String realname;

    @Column(name = "`QQ`")
    private String qq;

    @Column(name = "`EMAIL`")
    private String email;

    @Column(name = "`ADDRESS`")
    private String address;

    @Column(name = "`TEL`")
    private String tel;

    public static final String ID = "id";

    public static final String DB_ID = "ID";

    public static final String USERNAME = "username";

    public static final String DB_USERNAME = "USERNAME";

    public static final String PASSWORD = "password";

    public static final String DB_PASSWORD = "PASSWORD";

    public static final String USERTYPE = "usertype";

    public static final String DB_USERTYPE = "USERTYPE";

    public static final String ENABLED = "enabled";

    public static final String DB_ENABLED = "ENABLED";

    public static final String REALNAME = "realname";

    public static final String DB_REALNAME = "REALNAME";

    public static final String QQ = "qq";

    public static final String DB_QQ = "QQ";

    public static final String EMAIL = "email";

    public static final String DB_EMAIL = "EMAIL";

    public static final String ADDRESS = "address";

    public static final String DB_ADDRESS = "ADDRESS";

    public static final String TEL = "tel";

    public static final String DB_TEL = "TEL";

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return USERNAME
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return USERTYPE
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * @return ENABLED
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * @return REALNAME
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return TEL
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public static UserInfo defaultInstance() {
        UserInfo instance = new UserInfo();
        instance.password = new String("12345678");
        return instance;
    }
}