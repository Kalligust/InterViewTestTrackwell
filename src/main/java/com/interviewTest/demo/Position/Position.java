package com.interviewTest.demo.Position;

import com.interviewTest.demo.Vessel.Vessel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Position {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "vessel_id", referencedColumnName = "id")
  private Vessel vessel;

  private String name;
  private int longitude;
  private int latitude;

  public Position() {
  }

  public Position(String name, int longitude, int latitude) {
    this.name = name;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLongitude() {
    return longitude;
  }

  public void setLongitude(int longitude) {
    this.longitude = longitude;
  }

  public int getLatitude() {
    return latitude;
  }

  public void setLatitude(int latitude) {
    this.latitude = latitude;
  }

  public void linkToVessel(Vessel v) {
    this.vessel = v;
  }

}
