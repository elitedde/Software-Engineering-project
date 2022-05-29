package it.polito.ezshop.data;

public class UserImp implements User {
	private String username;
	private String password;
	private String role;
	private Integer id;

	public UserImp(String username, String password, String role, Integer id) {
		this.username = username;
		this.password = password;
		this.role = role;
		this.id = id;
	}

	@Override
	public Integer getId() {

		return this.id;
	}

	@Override
	public void setId(Integer id) {

		this.id = id;
	}

	@Override
	public String getUsername() {

		return this.username;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {

		return this.password;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	@Override
	public String getRole() {
		// TODO Auto-generated method stub
		return this.role;
	}

	@Override
	public void setRole(String role) {
		// TODO Auto-generated method stub
		this.role = role;
	}

}
