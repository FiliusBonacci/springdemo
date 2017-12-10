package com.example.springdemo.domain;

public class Family {
	private Person grandmother;
	private Person grandfather;
	private Person mother;
	private Person father;
	private Person daughter;
	private Person son;
	
	public Family() {
		super();
	}

	public Family(Person grandmother, Person grandfather, Person mother, Person father, Person daughter, Person son) {
		super();
		this.grandmother = grandmother;
		this.grandfather = grandfather;
		this.mother = mother;
		this.father = father;
		this.daughter = daughter;
		this.son = son;
	}

	public Person getGrandmother() {
		return grandmother;
	}

	public void setGrandmother(Person grandmother) {
		this.grandmother = grandmother;
	}

	public Person getGrandfather() {
		return grandfather;
	}

	public void setGrandfather(Person grandfather) {
		this.grandfather = grandfather;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getDaughter() {
		return daughter;
	}

	public void setDaughter(Person daughter) {
		this.daughter = daughter;
	}

	public Person getSon() {
		return son;
	}

	public void setSon(Person son) {
		this.son = son;
	}
	
	
	
}
