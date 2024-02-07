package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable{
	
	public String userName;
    public String password;
    
    public String getUserName() {
    	return userName;
    }
    
    public void setUserName(String userName) {
    	this.userName = userName;
    }
    
    public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }

}
