package com.bmob.demo.sms.bean;

import cn.bmob.v3.BmobUser;

public class User extends BmobUser {

	/**  
	 *  
	 */  
	
	private static final long serialVersionUID = 1L;
	
	private Integer age;//年龄

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
