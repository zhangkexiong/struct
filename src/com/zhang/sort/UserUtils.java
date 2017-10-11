package com.zhang.sort;

public class UserUtils {
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserUtils(Integer id, String username) {
        this.id = id;
        this.username = username;
    }
}
