package org.inetsolv.SprinfCoreAnnotations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	Integer aid;
	String city;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}