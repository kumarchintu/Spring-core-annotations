package org.inetsolv.SprinfCoreAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Person {
	@Value("20")
	private int pid;
	private String pname;
	private Address address;

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public int getPid() {
		return pid;
	}
	@Required
	@Value("132")
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Value("Anil")
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}	
}