package com.teligen.bcks.beans;

/**
 * @author 冶鹏豪
 * @date 2021/7/25
 */
public class User {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String account;
    private String password;

    public User(Long id, String account, String password) {
        this.id = id;
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
