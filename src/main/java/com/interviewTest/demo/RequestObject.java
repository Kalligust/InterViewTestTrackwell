package com.interviewTest.demo;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestObject {

  private Vessel vessel;
  private Position position;

  class Vessel {
    private String name;
    private String country;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCountry() {
      return country;
    }

    public void setCountry(String country) {
      this.country = country;
    }

  }

  class Position {
    private String date;
    private double latitude;
    private double longitude;
    private int speed;

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public double getLatitude() {
      return latitude;
    }

    public void setLatitude(double latitude) {
      this.latitude = latitude;
    }

    public double getLongitude() {
      return longitude;
    }

    public void setLongitude(double longitude) {
      this.longitude = longitude;
    }

    public int getSpeed() {
      return speed;
    }

    public void setSpeed(int speed) {
      this.speed = speed;
    }

  }

  public Vessel getVessel() {
    return vessel;
  }

  public void setVessel(Vessel vessel) {
    this.vessel = vessel;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

}
