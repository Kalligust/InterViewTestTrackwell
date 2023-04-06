package com.interviewTest.demo.Http;

import java.util.Date;

import com.interviewTest.demo.util;

public class CreateResponseObject {

  public static ResponseObject create(RequestObject req) {
    ResponseObject response = new ResponseObject();
    response.getVessel().setName(req.getVessel().getName());
    response.getPosition().setDate(req.getPosition().getDate());
    response.getPosition().setReceivedDate(new Date());
    response.getPosition().setLatitude(Math.toRadians(req.getPosition().getLatitude()));
    response.getPosition().setLongitude(Math.toRadians(req.getPosition().getLongitude()));
    response.getPosition().setSpeed(util.knotsToMS(req.getPosition().getSpeed()));

    return response;
  }
}
