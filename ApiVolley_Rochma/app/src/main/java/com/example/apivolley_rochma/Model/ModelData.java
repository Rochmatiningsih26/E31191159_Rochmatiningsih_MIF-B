package com.example.apivolley_rochma.Model;

public class ModelData {
    String username, grup, password;

    public ModelData() {}

    public ModelData(String username, String grup, String password) {
        this.username = username;
        this.grup = grup;
        this.password = password;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getGrup() { return grup; }

    public void setGrup(String grup) { this.grup = grup; }


}


