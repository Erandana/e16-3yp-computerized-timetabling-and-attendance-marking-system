package Group10.example.API.Model;

import Group10.example.API.Exception.ValidPassword;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Document(collection = "Lecturer")
public class Lecturer {
    public Lecturer( @NotNull(message = "User Name is mandatory") String userName, @NotNull(message = "password is mandatory") String password, String role, @Email(message = "Email should be valid") String email, String phoneNumber, String department) {

        this.userName = userName;
        this.password = password;
        this.role = role;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    @Id
    private String lectID;

    @NotNull(message = "User Name is mandatory")
    private String userName;

    @NotNull(message = "password is mandatory")
    @ValidPassword
    private String password;


    private String role;
    
    @Email(message = "Email should be valid")
    private String email;
    private String phoneNumber;
    private String department;
    

    public String getLectID() {
        return lectID;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setLectID(String lectID) {
        this.lectID = lectID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
