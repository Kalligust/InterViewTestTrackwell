package com.interviewTest.demo.Models;

import java.util.Date;

public class ResponseObject {

  private Vessel vessel;
  private Position position;

  public ResponseObject() {
    this.vessel = new Vessel();
    this.position = new Position();
  }

  public class Vessel {
    private String name;

    public Vessel() {
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public class Position {
    private String date;
    private Date receivedDate;
    private double latitude;
    private double longitude;
    private double speed;

    public Position() {
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public Date getReceivedDate() {
      return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
      this.receivedDate = receivedDate;
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

    public double getSpeed() {
      return speed;
    }

    public void setSpeed(double speed) {
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
