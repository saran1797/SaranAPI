package com.api.model.request;

public class SignupRequest {
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String lastname;
	private int mobileNumber;

	private SignupRequest(String username, String password, String email, String firstname, String lastname,
			int mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getMobilenumber() {
		return mobileNumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobileNumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "SignupRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstname="
				+ firstname + ", lastname=" + lastname + ", mobilenumber=" + mobileNumber + "]";
	}

	public static class builder {
		private String username;
		private String password;
		private String email;
		private String firstname;
		private String lastname;
		private int mobileNumber;
		
		

		public builder Username(String username) {
			this.username = username;
			return this;
		}
			public builder password(String password) {
				this.password = password;
				return this;

			}
			
			

			public builder email(String email) {
				this.email = email;
				return this;

			}

			public builder firstname(String firstname) {
				this.firstname = firstname;
				return this;

			}

			public builder lastname(String lastname) {
				this.lastname = lastname;
				return this;

			}
			public builder mobileNumber(int mobileNumber) {
				this.mobileNumber = mobileNumber;
				return this;

			}
		
			public SignupRequest build() {
				// TODO Auto-generated method stub
				SignupRequest signuprequest = new SignupRequest(username, password,email, firstname, lastname,mobileNumber);
				return signuprequest;
			}
			
			
			
		}
	}
