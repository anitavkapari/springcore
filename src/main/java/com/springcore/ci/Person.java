package com.springcore.ci;

import java.util.List;

public class Person {
	private String namePer;
	private int personId;
	private Certi certi;
	private List<String> list;
	public Person(String namePer, int personId,Certi certi,List<String> list) {
		this.namePer = namePer;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}
	@Override
	public String toString() {
		return this.namePer+" : "+this.personId+"{"+this.certi.name+"}"+"{"+this.list+"}";
	}

}
