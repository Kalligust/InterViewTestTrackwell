package com.interviewTest.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewTest.demo.CreateResponseJsonObject;
import com.interviewTest.demo.Models.Position;
import com.interviewTest.demo.Models.RequestObject;
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
    // Vessel newVessel = new Vessel("vesselthethird", "countrystan");
    Vessel newVessel = vessel;
    Vessel v = vesselService.save(newVessel);
    return v;
  }

  @PutMapping(value = "/req", consumes = "application/json", produces = "application/json")
  public String addPosition(@RequestBody RequestObject req) {
    String vesselName = req.getVessel().getName();
    String country = req.getVessel().getCountry();
    RequestObject.Position newPosition = req.getPosition();

    vesselService.addPosition(
        new Position(newPosition.getDate(), newPosition.getLatitude(),
            newPosition.getLongitude(), newPosition.getSpeed()),
        vesselName, country);

    return CreateResponseJsonObject.create(req);

  }

  @GetMapping("/vessels")
  public List<Vessel> getVessels() {
    return vesselRepo.findAll();
  }
}
