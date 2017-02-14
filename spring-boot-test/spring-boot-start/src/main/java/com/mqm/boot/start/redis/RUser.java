package com.mqm.boot.start.redis;

import java.io.Serializable;

public class RUser implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -5961524927810645036L;
	
	private String username;
	
    private Integer age;
    
    public RUser(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    
    
    


}
