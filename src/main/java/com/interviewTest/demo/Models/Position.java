package com.interviewTest.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

  @JsonIgnore
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "vessel_id", referencedColumnName = "id")
  private Vessel vessel;

  private String date;
  private double longitude;
  private double latitude;
  private double speed;

  public Position() {
  }

  public Position(String date, double longitude, double latitude, double speed) {
    this.date = date;
    this.longitude = longitude;
    this.latitude = latitude;
    this.speed = speed;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Vessel getVessel() {
    return vessel;
  }

  public void setVessel(Vessel vessel) {
    this.vessel = vessel;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  // Create reference to vessel that point is added to
  public void linkToVessel(Vessel v) {
    this.vessel = v;
  }

}
