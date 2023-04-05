package com.interviewTest.demo;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interviewTest.demo.Models.RequestObject;
import com.interviewTest.demo.Models.ResponseObject;

public class CreateResponseJsonObject {

  public static String create(RequestObject req) {
    ResponseObject response = instantiateResponseObject(req);
    return convertToJson(response);
  }

  public static ResponseObject instantiateResponseObject(RequestObject req) {
    ResponseObject response = new ResponseObject();
    response.getVessel().setName(req.getVessel().getName());
    response.getPosition().setDate(req.getPosition().getDate());
    response.getPosition().setReceivedDate(new Date());
    response.getPosition().setLatitude(Math.toRadians(req.getPosition().getLatitude()));
    response.getPosition().setLongitude(Math.toRadians(req.getPosition().getLongitude()));
    response.getPosition().setSpeed(util.knotsToMS(req.getPosition().getSpeed()));

    return response;
  }

  public static String convertToJson(ResponseObject response) {
    ObjectMapper Obj = new ObjectMapper();
    try {
      String jsonStr = Obj.writeValueAsString(response);
      return jsonStr;

    } catch (IOException e) {
      e.printStackTrace();
    }
    return "";
  }
}
