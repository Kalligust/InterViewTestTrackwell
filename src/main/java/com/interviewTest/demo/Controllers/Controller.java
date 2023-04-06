package com.interviewTest.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewTest.demo.Http.CreateResponseObject;
import com.interviewTest.demo.Http.RequestObject;
import com.interviewTest.demo.Http.ResponseObject;
import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Models.Vessel;
import com.interviewTest.demo.Repositories.VesselRepository;
import com.interviewTest.demo.Services.VesselService;

@RestController
@RequestMapping("/")
public class Controller {

  @Autowired
  private VesselRepository vesselRepo;

  @Autowired
  private VesselService vesselService;

  @PostMapping(value = "/addVessel", consumes = "application/json", produces = "application/json")
  public Vessel addVessel(@RequestBody Vessel vessel) {
    Vessel newVessel = vessel;
    Vessel v = vesselService.save(newVessel);
    return v;
  }

  @PostMapping(value = "/req", consumes = "application/json", produces = "application/json")
  public ResponseEntity<ResponseObject> addPosition(@RequestBody RequestObject req) {
    Vessel vessel = req.getVessel();
    Position newPosition = req.getPosition();

    vesselService.addPosition(vessel, newPosition);

    ResponseObject response = CreateResponseObject.create(req);

    return new ResponseEntity<ResponseObject>(response, HttpStatus.OK);

  }

  @GetMapping("/vessels")
  public List<Vessel> getVessels() {
    return vesselRepo.findAll();
  }
}
