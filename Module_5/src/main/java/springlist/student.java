package springlist;

public class student {
  private int id;
  private String fname,lname,email;
  private long mobile;
  
  
  public student(int id,String fname,String lname,String email,long mobile) {
	  super();
	  this.id = id;
	  this.fname = fname;
	  this.lname = lname;
	  this.email = email;
	  this.mobile = mobile;
	  
  }


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public long getMobile() {
	return mobile;
}


public void setMobile(long mobile) {
	this.mobile = mobile;
}


@Override
public String toString() {
	return "student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile=" + mobile
			+ "]";
}
  
}
