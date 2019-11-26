package com.bikash.registerlogin;

public class Loginclass {
    private String username;
    private  String password;

    public Loginclass(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean result()
    {
        if(username.equals("admin")&&password.equals("admin"))
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
