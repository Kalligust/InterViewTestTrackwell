package com.interviewTest.demo.Http;

import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Models.Vessel;

public class RequestObject {

  private Vessel vessel;
  private Position position;

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
