package com.qikemi.packages.excel;

public class Member {

	private Integer id;
	
	private String name;
	
	private String address;
	
	private String tel;

	public Member() {
		super();
	}

	public Member(Integer id, String name, String address, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
