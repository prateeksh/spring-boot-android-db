package com.example;

import org.hibernate.validator.constraints.NotEmpty;

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

  @NotEmpty
  @Column(name = "name")
  private String name;

  @NotEmpty
  @Column(name = "occupation")
  private String occupation;

  @NotEmpty
  @Column(name = "google")
  private String google;


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

  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }


  public String getGoogle() {
    return google;
  }

  public void setGoogle(String google) {
    this.google = google;
  }

}

