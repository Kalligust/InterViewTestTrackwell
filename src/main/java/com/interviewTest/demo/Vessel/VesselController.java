package com.interviewTest.demo.Vessel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewTest.demo.RequestObject;
import com.interviewTest.demo.Position.Position;
import com.interviewTest.demo.Position.PositionRepository;

@RestController
@RequestMapping("/")
public class VesselController {
  @Autowired
  private VesselRepository vesselRepo;

  @Autowired
  private PositionRepository positionRepo;

  @PostMapping(value = "/addVessel", consumes = "application/json", produces = "application/json")
  public Vessel addVessel(@RequestBody Vessel vessel) {
    // Vessel newVessel = new Vessel(vessel.getName(), vessel.getVesselCountry());
    // Vessel v = vesselRepo.save(newVessel);
    Vessel newVessel = new Vessel("bleble", "vessel.getVesselCountry()");
    System.out.println(newVessel.getId());
    Vessel v = vesselRepo.save(newVessel);
    return v;
  }

  @PutMapping(value = "/addPos", consumes = "application/json", produces = "application/json")
  public Vessel addPosition(@RequestBody Vessel vessel) {
    Vessel v = vesselRepo.findByName(vessel.getName());
    // for (Vessel p : v.getPositions()) {
    // System.out.println(p.getLatitude());
    // System.out.println(p.getLongitude());
    // }
    Position position = positionRepo.save(new Position("new position", 45, 56));
    System.out.println(position.getId());

    position.linkToVessel(v);
    v.addPosition(position);
    return vesselRepo.save(v);

  }

  @PostMapping(value = "/req", consumes = "application/json", produces = "application/json")
  public RequestObject checkRequest(@RequestBody RequestObject req) {
    System.out.println("bleb");
    return req;

  }

  @GetMapping("/vessels")
  public List<Vessel> getVessels() {
    return vesselRepo.findAll();
  }
}
