package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name",nullable= false)

  String name;
  String image;
  @Column(name = "occupation",nullable= false)

  String occupation;
  @Column(name = "company",nullable= false)

  String company;
  @Column(name = "phone",nullable= false)

  String phone;
  @Column(name = "google",nullable= false)

  String google;
  @Column(name = "facebook",nullable= false)

  String facebook;
  @Column(name = "blog", nullable= false)

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

