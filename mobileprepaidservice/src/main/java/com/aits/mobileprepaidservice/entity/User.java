package com.aits.mobileprepaidservice.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String mobile;
	private String email;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)    //Not manytomany. Cz, many users can do many recharges can do.ex. In charge plans. I have many plans like 299, 399 etc and those all can be selected by many plans. But actually im doing 355 rcharge. And this is not done by all. So. Many recharges can be done by many users, but the 
	private List<RechargeHistory> history;
	
	public User() {
		
	}

	public User(Long id, String name, String mobile, String email, String password, Role role,
			List<RechargeHistory> history) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = role;
		this.history = history;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<RechargeHistory> getHistory() {
		return history;
	}

	public void setHistory(List<RechargeHistory> history) {
		this.history = history;
	}	

}
