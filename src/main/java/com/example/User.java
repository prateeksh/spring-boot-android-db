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
  String name;
  String image;
  @NotEmpty
  String occupation;
  @NotEmpty
  String company;
  @NotEmpty
  String phone;
  String work;
  @NotEmpty
  String hangout;
  @NotEmpty
  String skype;
  @NotEmpty
  String google;
  @NotEmpty
  String facebook;
  @NotEmpty
  String blog;

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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
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

  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }

  public String getHangout() {
    return hangout;
  }

  public void setHangout(String hangout) {
    this.hangout = hangout;
  }

  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getGoogle() {
    return google;
  }

  public void setGoogle(String google) {
    this.google = google;
  }

  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public String getBlog() {
    return blog;
  }

  public void setBlog(String blog) {
    this.blog = blog;
  }
}

