package com.example.demo.dto;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbg.generated Fri Nov 30 17:48:48 GMT+08:00 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}