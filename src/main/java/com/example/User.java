package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotEmpty
  private String name;
  @NotEmpty
  private String image;
  @NotEmpty
  private String occupation;
  @NotEmpty
  private String company;
  @NotEmpty
  private String phone;
  @NotEmpty
  private String google;

  public User(){}

  public long getId(){
    return id;
  }

  public void setId(long id){
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage(){
    return image;
  }

  public void setImage(String image){
    this.image = image;
  }

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getGoogle() {
    return google;
  }

  public void setGoogle(String google) {
    this.google = google;
  }

}

