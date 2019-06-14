package com.app.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@ConfigurationProperties("my.data")
@Component
public class DataRunner implements CommandLineRunner{

	private int sid;
	private String sname;
	private double sfee;
	//private String[]prjs;
	private Set<String>prjs1;
	private List<String>prjs;
	private Profile dept;
	private Map<String,String>dept1;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	public Set<String> getPrjs1() {
		return prjs1;
	}

	public void setPrjs1(Set<String> prjs1) {
		this.prjs1 = prjs1;
	}

	public List<String> getPrjs() {
		return prjs;
	}

	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}

	public Profile getDept() {
		return dept;
	}

	public void setDept(Profile dept) {
		this.dept = dept;
	}

	public Map<String, String> getDept1() {
		return dept1;
	}

	public void setDept1(Map<String, String> dept1) {
		this.dept1 = dept1;
	}

	@Override
	public String toString() {
		return "DataRunner [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + ", prjs1=" + prjs1 + ", prjs=" + prjs
				+ ", dept=" + dept + ", dept1=" + dept1 + "]";
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}
}



