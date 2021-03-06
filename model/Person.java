package com.learning.SpringBoot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
	@Column(name="lastName")
  private String lastName;
	@Column(name="firstName")
  private String firstName;

  public Person() {
  }

  public Person(int id,String firstName, String lastName) {
	  this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "id"+ id + "firstName: " + firstName + ", lastName: " + lastName;
  }

}